package com.learn.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.learn.demo.bean.Coure;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(isolation = Isolation.READ_COMMITTED)

public interface CoureDao extends BaseMapper<Coure> {
    public List<Coure> findAll();
}
