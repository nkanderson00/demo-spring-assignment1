package com.example.assignment1;

public class Address
{

    private String city;
    private String state;
    private String country;
    private String zipcode;


    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getCountry()
    {
        return country;
    }

    public String getZipcode()
    {
        return zipcode;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return String.format("Address [city = '%s', state = '%s', country = '%s', zipcode = '%s']",
                city, state, country, zipcode);
    }
}