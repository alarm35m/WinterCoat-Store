package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces;

public interface IWinterCoat {
    boolean equals(Object object);

    Long getId();

    String getName();

    String getBrand();

    String getColor();

    String getSize();

    String getType();

    String getPrice();

    String getGender();

    void setId(Long id);

    void setName(String name);

    void setBrand(String brand);

    void setColor(String color);

    void setSize(String size);

    void setType(String type);

    void setPrice(String price);

    void setGender(String gender);

    String toString();
}
