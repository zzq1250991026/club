package com.learn.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.learn.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
