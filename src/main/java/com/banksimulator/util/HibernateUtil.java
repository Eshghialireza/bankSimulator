package com.banksimulator.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    public static final EntityManagerFactory emf;
    static{
        emf= Persistence.createEntityManagerFactory("default");
    }
    public static EntityManagerFactory getEmf(){
        return emf;
    }
}
