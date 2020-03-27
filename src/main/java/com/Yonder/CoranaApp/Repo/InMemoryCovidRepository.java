package com.Yonder.CoranaApp.Repo;

import com.Yonder.CoranaApp.Countries.AllCountries;
import com.Yonder.CoranaApp.Countries.Country;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class InMemoryCovidRepository implements ICovidRepository{

    private List<AllCountries> allCountries;
    private Map<String,List<Country>> byCountryList;

    @Override
    public List<Country> getCountry(String name) {
        return byCountryList.get(name);
    }

    @Override
    public List<AllCountries> getAllCountries() {

        return allCountries;
    }

    @Override
    public void saveAllCountries(List<AllCountries> allCountries) {
        this.allCountries = allCountries;
    }

    @Override
    public void saveByCountry(Map<String, List<Country>> byCountry) {
        this.byCountryList = byCountry;
    }


}
