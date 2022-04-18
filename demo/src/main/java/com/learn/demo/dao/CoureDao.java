package com.learn.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.learn.demo.bean.Coure;

import java.util.List;

public interface CoureDao extends BaseMapper<Coure> {
    public List<Coure> findAll();
}
