package com.sai.jpa.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Location{
    private String city;
    private String address;
    private String institution;
    public Location(){

    }
    public Location(String city,String address,String institution){
        this.city=city;
        this.address=address;
        this.institution=institution;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
