package com.banksimulator.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory emf;

    static{
        emf= Persistence.createEntityManagerFactory("default");
    }

    private static EntityManager em;

    private HibernateUtil(){
    }

    public static EntityManager getEm() {
        if(em==null){
            em=emf.createEntityManager();
        }
        return em;
    }
}
