package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities;

import com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces.IStore;

//MongoDB Entity

public class Store implements IStore {

    private String name;
    private String street;
    private String city;
    private String zip;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getZip() {
        return zip;
    }

    @Override
    public void setZip(String zip) {
        this.zip = zip;
    }


}
