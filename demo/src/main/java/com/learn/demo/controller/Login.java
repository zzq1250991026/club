package com.learn.demo.controller;

import com.learn.demo.bean.Student;
import com.learn.demo.config.User1;
import com.learn.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@Lazy
public class Login {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ApplicationContext applicationContext;
    public Login(){
        System.out.println("控制器类");
    }
    @RequestMapping("admin/login")
    public String login(){
        return "11111";
    }

    @RequestMapping("admin/lists")
    public List<Student> lists(){
        return studentService.getStudents();
    }
    @GetMapping("admin/hello")
    public String admin(){
        return "hello admin";
    }
    @GetMapping("user/hello")
    public String user(){
        return "hello user";
    }
    @GetMapping("db/hello")
    public String db(){
        return "db admin";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello My";
    }
    @RequestMapping("admin/putstudent")
    public String PutStudents() throws ParseException {
        List<Student> list =new ArrayList<>();
        list.add(new Student(17+"","李逵","2021-2-21","男"));
        list.add(new Student(21+"","林场","2021-2-21","男"));
        list.add(new Student(31+"","柴进","2021-2-21","男"));
        list.add(new Student(41+"","白日鼠","2021-2-21","男"));
        try{
            Integer vb=studentService.insertStudent(list);
            return "插入成功"+vb;
        }catch (Exception e){
            System.err.println(e);
        }
        return "插入失败";
    }
    @RequestMapping("admin/insert")
    public String InsertStudent() throws ParseException {
        List<Student> list =new ArrayList<>();
        list.add(new Student(17+"","李逵","2021-2-21","男"));
        list.add(new Student(21+"","林场","2021-2-21","男"));
        list.add(new Student(31+"","柴进","2021-2-21","男"));
        list.add(new Student(41+"","白日鼠","2021-2-21","男"));
        try{
            studentService.inser();
            return "插入成功";
        }catch (Exception e){
            System.err.println(e);
        }finally {
            return "插入失败";
        }
    }
    @RequestMapping("admin/put")
    public Integer PutStudent() throws ParseException {
        return studentService.insertStudent(new Student(41+"","白日鼠","2021-2-21","男"));
    }
    @GetMapping("user1")
    public String Douser1(String name){

         User1 user1 =applicationContext.getBean(User1.class);;
         user1.setName(name);
         return user1.getName();
    }
    @GetMapping("sage")
    public List<Map<String, Student>> sages(String sage){
        Map<String,  Student> map= new HashMap<String, Student>();
        Student student =studentService.getStudents().get(2);
        map.put(student.getSname(),student);
        List<Map<String, Student>> list =new ArrayList<>();
        list.add(map);
        return list;
    }
    @GetMapping("sage2")
    public Map<String, Student> sages2(String sage){
        Map<String, Student> findbysage = studentService.findbysage(sage);
        return findbysage;
    }
}
