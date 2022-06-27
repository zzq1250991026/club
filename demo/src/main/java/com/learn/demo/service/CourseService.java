package com.learn.demo.service;

import com.learn.demo.bean.Coure;
import com.learn.demo.dao.CoureDao;

import javax.annotation.Resource;
import java.util.List;

public class CourseService {
    @Resource
    private CoureDao coureDao;
    public List<Coure> findAll(){
        return coureDao.findAll();
    }
}
