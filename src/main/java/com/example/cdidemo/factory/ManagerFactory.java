package com.example.cdidemo.factory;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManagerFactory {
    @Produces
    public EntityManager getManager() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("postgres");
        return managerFactory.createEntityManager();
    }
}
