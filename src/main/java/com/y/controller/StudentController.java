package com.y.controller;

import com.y.entity.Student;
import com.y.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent")
    public ModelAndView addStudent(Student student){
        ModelAndView mv=new ModelAndView();
        int i = studentService.insertStudent(student);
        if (i>0){
            String tip="姓名为：【"+student.getName()+"】学生注册成功";
            mv.addObject("tip",tip);
        }
        mv.setViewName("result");
        System.out.println("");
        return mv;

    }

    @RequestMapping(value = "/query")
    @ResponseBody
    public List<Student> query(){
        List<Student> list = studentService.getList();
        return list;
    }

}




