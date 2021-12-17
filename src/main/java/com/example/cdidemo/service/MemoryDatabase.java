package com.example.cdidemo.service;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Alternative
public class MemoryDatabase implements Database {
    private List<Student> studentList;
    private Logger logger;


    // Constructor Injection
    @Inject
    public MemoryDatabase(Logger logger) {
        this.logger = logger;
        studentList = fillList();
    }

    // return ArrayList with some random Students
    private ArrayList<Student> fillList() {
        Student a = new Student();
        a.setId(1L);
        a.setName("Max Koch");
        a.setMatr(680331);
        a.setStud("AI");

        Student b = new Student();
        b.setId(2L);
        b.setName("Jan Petersen");
        b.setMatr(680131);
        b.setStud("MI");

        ArrayList<Student> list = new ArrayList();
        list.add(a);
        list.add(b);

        return list;
    }

    @Override
    public List<Student> getAll() {
        logger.log("Get all from MemoryDatabase");
        return studentList;
    }

    @Override
    public Student getOneById(int id) {
        logger.log("Get one by Id " + id + " from MemoryDatabase");
        return studentList.get(id);
    }
}
