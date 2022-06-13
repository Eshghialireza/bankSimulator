package com.banksimulator.domain;
import com.banksimulator.base.domain.Base;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Employee extends Base<Integer> {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Embedded
    private Address address;
    @OneToOne
    private BankBranch bankBranch;
    public Employee(String name, String lastName, Address address, BankBranch bankBranch) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.bankBranch = bankBranch;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Employee() {
    }
}
