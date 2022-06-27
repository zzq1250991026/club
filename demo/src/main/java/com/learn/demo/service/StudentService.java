package com.learn.demo.service;

import com.learn.demo.bean.Student;
import com.learn.demo.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> getStudents(){
        String by="Sname";
        return studentDao.findAll(by);
    }
    public Integer insertStudent(List<Student> students){
         return studentDao.inserts(students);
    }
    public Integer insertStudent(Student student){
        return studentDao.insert(student);
    }
    public void inser(){
        studentDao.insertBatch();
    }
    public Map<String, Student> findbysage(String sage){
        Map<String, Student> bysage = studentDao.findBysage(sage);
        //String 王菊 = bysage.get("王菊").getSname();
        List<Student> all = studentDao.findAll("sname");
        System.err.println(all.get(2).getSname());
        System.err.println(bysage.get("王菊"));
        return studentDao.findBysage(sage);
    }
}
