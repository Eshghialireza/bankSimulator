package com.banksimulator.domain;
import com.banksimulator.base.domain.Base;

import javax.persistence.*;
import java.util.List;

@Entity
public class BankBranch extends Base<Integer> {

    @OneToOne
    private Boss boss;

    @Column(nullable = false)
@Embedded
    private Address address;
    @Column(nullable = false)
@OneToMany(mappedBy = "bankBranch")
private List<Employee> employee;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public BankBranch() {
    }

    public BankBranch(Boss boss, Address address, List<Employee> employee) {
        this.boss = boss;
        this.address = address;
        this.employee = employee;
    }
}
