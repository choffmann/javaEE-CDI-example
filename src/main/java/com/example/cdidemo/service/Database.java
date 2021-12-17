package com.example.cdidemo.service;

import java.util.List;

public interface Database {
    List<Student> getAll();

    Student getOneById(int id);
}
