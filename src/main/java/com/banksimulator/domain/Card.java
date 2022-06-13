package com.banksimulator.domain;
import com.banksimulator.base.domain.Base;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Card extends Base<Integer> {
    @Column(nullable = false)
    private Long cardNumber;
    @Column(nullable = false)
    private Integer wrongPass;
    @Column(nullable = false)
    private String cvv2;
    @Column(nullable = false)
    private Date cardExpiration;
    @Column(nullable = false)
    private int cardPassWord;

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getWrongPass() {
        return wrongPass;
    }

    public void setWrongPass(Integer wrongPass) {
        this.wrongPass = wrongPass;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public Date getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(Date cardExpiration) {
        this.cardExpiration = cardExpiration;
    }

    public int getCardPassWord() {
        return cardPassWord;
    }

    public void setCardPassWord(int cardPassWord) {
        this.cardPassWord = cardPassWord;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card() {
    }

    public Card(Long cardNumber, Integer wrongPass, String cvv2, Date cardExpiration, int cardPassWord, Account account) {
        this.cardNumber = cardNumber;
        this.wrongPass = wrongPass;
        this.cvv2 = cvv2;
        this.cardExpiration = cardExpiration;
        this.cardPassWord = cardPassWord;
        this.account = account;
    }

    @OneToOne(mappedBy = "card")
    private Account account;
}
