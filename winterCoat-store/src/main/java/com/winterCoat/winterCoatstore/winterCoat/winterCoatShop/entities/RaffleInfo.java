package com.winterCoat.winterCoatstore.winterCoat.winterCoatShop.entities;

public class RaffleInfo {

    private Long raffleId;

    private String name;

    private String email;

    private String phoneNumber;

    private String winterCoatName;

    private String brand;

    public RaffleInfo(){

    }

    public Long getRaffleId() {
        return raffleId;
    }

    public void setRaffleId(Long raffleId) {
        this.raffleId = raffleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWinterCoatName() {
        return winterCoatName;
    }

    public void setWinterCoatName(String sneakerName) {
        this.winterCoatName = winterCoatName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
