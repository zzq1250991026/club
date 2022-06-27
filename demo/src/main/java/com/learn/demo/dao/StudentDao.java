package com.learn.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.learn.demo.bean.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao extends BaseMapper<Student> {
    public List<Student> findAll(String by);
    public Integer inserts(@Param("students") List<Student> students);
    int insertBatch();
    @MapKey("Sname")
    Map<String,Student> findBysage(String sage);
}
