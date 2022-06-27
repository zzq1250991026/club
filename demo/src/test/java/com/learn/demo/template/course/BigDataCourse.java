package com.learn.demo.template.course;

public class BigDataCourse extends NetworkCourse{
    private boolean needHomeworkflag =false;
    public BigDataCourse(boolean needHomeworkflag){
        this.needHomeworkflag=needHomeworkflag;
    }
    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkflag;
    }

    public static void main(String[] args) {
        System.out.println("java架构师课程");
        NetworkCourse javacourse=new JavaCourse();
        javacourse.createCourse();
        System.out.println("大数据课程");
        NetworkCourse bigDatacourse =new BigDataCourse(true);
        bigDatacourse.createCourse();
    }
}
