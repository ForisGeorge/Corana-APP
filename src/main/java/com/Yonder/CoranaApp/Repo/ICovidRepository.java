package com.Yonder.CoranaApp.Repo;

import com.Yonder.CoranaApp.Countries.AllCountries;
import com.Yonder.CoranaApp.Countries.Country;

import java.util.List;
import java.util.Map;

public interface ICovidRepository {

     List<Country> getCountry(String name);
     List<AllCountries>getAllCountries();
     void saveAllCountries(List<AllCountries> allCountries);
     void saveByCountry(Map<String, List<Country>> byCountry);


}
