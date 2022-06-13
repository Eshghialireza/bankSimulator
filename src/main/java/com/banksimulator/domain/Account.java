package com.banksimulator.domain;

import com.banksimulator.base.domain.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Account extends Base<Integer> {
    @Column(nullable = false)
    private long balance;
    @OneToOne
    private Card card;
    @OneToOne
    private BankBranch bankBranch;
    @OneToOne
    private Customer customer;

    public Account(long balance, Card card, BankBranch bankBranch, Customer customer) {
        this.balance = balance;
        this.card = card;
        this.bankBranch = bankBranch;
        this.customer = customer;
    }

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankBranch getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(BankBranch bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
