package com.Yonder.CoranaApp.Countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllCountries {

    private String country;
    private String slug;
    private List<String> provinces = new ArrayList<>();

    public AllCountries() {
    }

    @Override
    public String toString() {
        return "AllCountries{" +
                "Country='" + country + '\'' +
                '}';
    }

    public AllCountries(String country, String slug, List<String> provinces) {
        this.country = country;
        this.slug = slug;
        this.provinces = provinces;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("Provinces")
    public List<String> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<String> provinces) {
        this.provinces = provinces;
    }
}

