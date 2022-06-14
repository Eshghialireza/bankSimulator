package com.banksimulator.domain;

import com.banksimulator.base.domain.Base;

import javax.persistence.*;

@Embeddable
public class Address{
    @Column(nullable = false)
    private String province;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String postalCode;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address(String province, String city, String postalCode) {
        this.province = province;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address() {
    }
}
