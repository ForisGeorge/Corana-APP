package Countries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllCountries {

    private String Country;
    private String Slug;
    private String Provinces;

    public AllCountries() {
    }

    @Override
    public String toString() {
        return "AllCountries{" +
                "Country='" + Country + '\'' +
                '}';
    }

    public AllCountries(String country, String slug, String provinces) {
        Country = country;
        Slug = slug;
        Provinces = provinces;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getProvinces() {
        return Provinces;
    }

    public void setProvinces(String provinces) {
        Provinces = provinces;
    }
}
