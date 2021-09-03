package com.y.service.imp;

import com.y.dao.StudentDao;
import com.y.entity.Student;
import com.y.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getList() {

        return studentDao.getList();
    }

    @Override
    public int insertStudent(Student student) {

        return studentDao.insertStudent(student);
    }
}
