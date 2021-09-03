package com.y.dao;

import com.y.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getList();
    int insertStudent(Student student);
}
