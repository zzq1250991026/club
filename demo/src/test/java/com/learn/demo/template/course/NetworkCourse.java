package com.learn.demo.template.course;

public abstract class NetworkCourse {
    protected final void createCourse(){
        this.postPreResource();
        this.createPPt();
        this.liveVideo();
        this.postNode();
        this.postSource();
        if (needHomework()){
            checkHomework();
        }
    }
    abstract void checkHomework();
    protected boolean needHomework(){return false;}
    final void postSource(){
        System.out.println("提交代码");
    }
    final void postNode(){
        System.out.println("提交代码和笔记");
    }
    final void liveVideo(){
        System.out.println("直播授课");
    }
    final void createPPt(){
        System.out.println("创建备课ppt");
    }
    final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
