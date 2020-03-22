package com.Yonder.CoranaApp;

import Countries.AllCountries;
import Countries.Country;
import Services.CallRestService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CovidController {


    private CallRestService callRestService= new CallRestService();

    @GetMapping(path = "/countries")
    public AllCountries[] allCountries(){

        return  callRestService.countries();
    }

    @GetMapping(path = "/countries/{name}")
    public Country countryVariable (@PathVariable String name){
        return callRestService.getCountry(name);
    }
}
