package AircraftTicketProject.Classes;

import java.io.Serializable;

public class City implements Serializable {

    private Long id;
    private String cityName, country, short_name;

    public City(Long id, String name, String country, String short_name) {
        this.id = id;
        this.cityName = name;
        this.country = country;
        this.short_name = short_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String name) {
        this.cityName = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    @Override
    public String toString() {
        return this.country + " " + this.cityName + "-" + this.short_name;
    }
}
