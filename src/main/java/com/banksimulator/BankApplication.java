package com.banksimulator;

import com.banksimulator.util.HibernateUtil;

import javax.persistence.EntityManager;

public class BankApplication {
    public static void main(String[] args) {
       EntityManager em= HibernateUtil.getEm();
    }
}
