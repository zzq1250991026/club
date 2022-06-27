package com.learn.demo.service;

import com.learn.demo.bean.Student;
import com.learn.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegService {
    @Autowired
    private StudentDao studentDao;
    public int reg(){
        return studentDao.insert(new Student());
    }
}
