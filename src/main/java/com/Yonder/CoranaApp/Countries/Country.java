package com.Yonder.CoranaApp.Countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private String country;
    private String province;
    private double lat;
    private double lon;
    private String date;
    private int cases;
    private String status;

    public Country() {
    }

    public Country(String country, String province, double lat, double lon, String date, int cases, String status) {
        this.country = country;
        this.province = province;
        this.lat = lat;
        this.lon = lon;
        this.date = date;
        this.cases = cases;
        this.status = status;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("Lat")
    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @JsonProperty("Lon")
    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("Cases")
    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", date=" + date +
                ", cases=" + cases +
                ", status='" + status + '\'' +
                '}';
    }
}