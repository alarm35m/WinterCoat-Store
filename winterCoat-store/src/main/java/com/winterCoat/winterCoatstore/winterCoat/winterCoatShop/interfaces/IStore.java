package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces;

public interface IStore {

    boolean equals(Object object);

    String getName();

    String getStreet();

    String getCity();

    String getZip();

    void setName(String name);

    void setStreet(String street);

    void setCity(String city);

    void setZip(String zip);

    String toString();
}
