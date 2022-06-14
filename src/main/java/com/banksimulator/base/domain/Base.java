package com.banksimulator.base.domain;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
public abstract class Base <ID extends Serializable> implements Serializable{
    @Id
    @GeneratedValue
    private ID id;

    public Base() {
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
