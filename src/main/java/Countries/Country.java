package Countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {

    private String Country;
    private String Province;
    private double Lat ;
    private double Lon;
    private Date Date;
    private int Cases;
    private String Status;

    public Country() {
    }

    public Country(String country, String province, double lat, double lon, java.util.Date date, int cases, String status) {
        Country = country;
        Province = province;
        Lat = lat;
        Lon = lon;
        Date = date;
        Cases = cases;
        Status = status;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Country='" + Country + '\'' +
                ", Province='" + Province + '\'' +
                ", Lat=" + Lat +
                ", Lon=" + Lon +
                ", Date=" + Date +
                ", Cases=" + Cases +
                ", Status='" + Status + '\'' +
                '}';
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLon() {
        return Lon;
    }

    public void setLon(double lon) {
        Lon = lon;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public int getCases() {
        return Cases;
    }

    public void setCases(int cases) {
        Cases = cases;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
