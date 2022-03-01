package com.learn.demo.service;

import com.learn.demo.bean.Student;
import com.learn.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> getStudents(){
        return studentMapper.selectList(null);
    }
}
