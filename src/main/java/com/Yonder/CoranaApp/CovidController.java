package com.Yonder.CoranaApp;

import com.Yonder.CoranaApp.Countries.AllCountries;
import com.Yonder.CoranaApp.Countries.Country;
import com.Yonder.CoranaApp.Services.CallRestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CovidController {


    private CallRestService callRestService;

    public CovidController(CallRestService callRestService) {
        this.callRestService = callRestService;
    }

    @GetMapping(path = "/countries")
    public List<AllCountries> allCountries(){

        return  callRestService.countries();
    }

    @GetMapping(path = "/countries/{name}")
    public List<Country> countryVariable (@PathVariable String name){
        return callRestService.getCountry(name);
    }
}
