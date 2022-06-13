package com.banksimulator.domain;
import com.banksimulator.base.domain.Base;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Boss extends Base<Integer> {
    @OneToOne(mappedBy = "boss")
    private BankBranch bankBranch;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false)
    private Date entryDate;

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Boss(BankBranch bankBranch, String name, String lastName, String passWord, Date entryDate) {
        this.bankBranch = bankBranch;
        this.name = name;
        this.lastName = lastName;
        this.passWord = passWord;
        this.entryDate = entryDate;
    }

    public Boss() {
    }
}
