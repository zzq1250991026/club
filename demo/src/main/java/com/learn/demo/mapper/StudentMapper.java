package com.learn.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.learn.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}
