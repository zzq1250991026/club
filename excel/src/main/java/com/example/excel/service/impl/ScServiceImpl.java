package com.example.excel.service.impl;

import com.example.excel.bean.Sc;
import com.example.excel.dao.ScDao;
import com.example.excel.service.ScService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScServiceImpl implements ScService {
    @Autowired
    private ScDao scDao;
    @Override
    public List<Sc> findAll(){

        return scDao.selectList(null);
    };
}
