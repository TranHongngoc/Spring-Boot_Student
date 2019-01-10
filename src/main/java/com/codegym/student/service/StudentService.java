package com.codegym.student.service;

import com.codegym.student.model.Student;

import java.util.List;

public interface StudentService {
    Iterable<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void remove(Long id);
}
