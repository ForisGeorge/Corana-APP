package Services;

import Countries.AllCountries;
import Countries.Country;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallRestService {


    public  AllCountries[] countries (){
        RestTemplate restTemplate = new RestTemplate();
        AllCountries[] countries = restTemplate.getForObject("https://api.covid19api.com/countries", AllCountries[].class);
        return countries;
    }

    public Country[] getCountry(String name){
        RestTemplate restTemplate = new RestTemplate();
        Country[] country = restTemplate.getForObject(String.format("https://api.covid19api.com/country/%s/status/confirmed",name),Country[].class);
        return country;

    }
}
