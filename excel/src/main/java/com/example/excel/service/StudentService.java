package com.example.excel.service;

import com.example.excel.bean.Student;
import com.example.excel.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> getStudents(){
        return studentDao.selectList(null);
    }
}
