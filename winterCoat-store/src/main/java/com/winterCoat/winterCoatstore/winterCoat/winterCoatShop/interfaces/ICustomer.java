package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.interfaces;

public interface ICustomer {
    boolean equals(Object object);

    Long getRaffleId();

    Long getWinterCoatId();

    String getName();

    String getEmail();

    String getPhoneNumber();

    void setRaffleId(Long raffleId);

    void setWinterCoatId(Long sneakerId);

    void setName(String name);

    void setEmail(String email);

    void setPhoneNumber(String phoneNumber);

    String toString();

}
