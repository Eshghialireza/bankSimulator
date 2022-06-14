package com.banksimulator.domain;
import com.banksimulator.base.domain.Base;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
public class Customer extends Base<Long> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String passWord;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer() {
    }

    public Customer(String name, String lastName, String passWord, List<Account> accounts, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.passWord = passWord;
        this.accounts = accounts;
        this.address = address;
    }

    @Column(nullable = false)
    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;
    @Embedded
    private Address address;
}
