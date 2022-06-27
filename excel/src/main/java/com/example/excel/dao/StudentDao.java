package com.example.excel.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.excel.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
}
