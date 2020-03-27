package com.Yonder.CoranaApp.Services;

import com.Yonder.CoranaApp.Countries.AllCountries;
import com.Yonder.CoranaApp.Countries.Country;
import com.Yonder.CoranaApp.Repo.ICovidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallRestService {

    private ICovidRepository covidRepository;

    @Autowired
    public CallRestService(ICovidRepository covidRepository) {
        this.covidRepository = covidRepository;
    }

    public List<AllCountries> countries (){
     return covidRepository.getAllCountries();
    }

    public List<Country> getCountry(String name){
       return covidRepository.getCountry(name);

    }
}
