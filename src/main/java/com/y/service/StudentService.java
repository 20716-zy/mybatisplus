package com.y.service;

import com.y.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getList();
    int insertStudent(Student student);
}
