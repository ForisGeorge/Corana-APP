package com.Yonder.CoranaApp.Services;

import com.Yonder.CoranaApp.Countries.AllCountries;
import com.Yonder.CoranaApp.Countries.Country;
import com.Yonder.CoranaApp.Repo.ICovidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableScheduling
@Service
public class CovidSyncService {

    @Autowired
    private ICovidRepository covidRepository;

    public CovidSyncService(ICovidRepository covidRepository) {
        this.covidRepository = covidRepository;
    }

    @Scheduled(fixedRate =  60000)
    public  void saveAllcountries (){
        RestTemplate restTemplate = new RestTemplate();
        AllCountries[] countries = restTemplate.getForObject("https://api.covid19api.com/countries", AllCountries[].class);
        covidRepository.saveAllCountries(List.of(countries));
        savebyCountry();
    }


    public void  savebyCountry() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, List<Country>> saveAll = new HashMap<>();

        try {
            for (AllCountries pathCountry : covidRepository.getAllCountries()) {
                if (!pathCountry.getCountry().equals("")) {
                    Country[] Country = restTemplate.getForObject(String.format("https://api.covid19api.com/country/%s/status/confirmed", pathCountry.getCountry()), Country[].class);
                    saveAll.put(pathCountry.getCountry(), List.of(Country));
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        covidRepository.saveByCountry(saveAll);
    }
}