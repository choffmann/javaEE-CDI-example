package com.example.cdidemo.service;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Default
public class PostgresDatabase implements Database {
    private Logger logger;

    @Inject
    private EntityManager manager;

    // Constructor Injection
    @Inject
    public PostgresDatabase(Logger logger) {
        this.logger = logger;
    }

    @Override
    public List<Student> getAll() {
        logger.log("Get all from PostgresDatabase");
        TypedQuery<Student> query = manager.createQuery("select t from Student t", Student.class);
        return query.getResultList();
    }

    @Override
    public Student getOneById(int id) {
        logger.log("Get one by Id " + id + " from PostgresDatabase");
        return manager.find(Student.class, id);
    }
}
