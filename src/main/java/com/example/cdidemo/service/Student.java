package com.example.cdidemo.service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int matr;
    private String stud;

    public Student() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getStud() {
        return stud;
    }

    public void setStud(String stud) {
        this.stud = stud;
    }
}
