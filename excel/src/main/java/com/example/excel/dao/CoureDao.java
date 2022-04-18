package com.example.excel.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.excel.bean.Coure;

import java.util.List;

public interface CoureDao extends BaseMapper<Coure> {
    public List<Coure> findAll();
}
