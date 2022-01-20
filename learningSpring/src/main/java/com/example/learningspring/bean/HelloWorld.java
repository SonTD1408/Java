package com.example.learningspring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printProperty(){
        System.out.println(message);
    }

//    @PostConstruct
//    public void initIt(){
//        System.out.println("sau khi khơi tạo message có giá trị: "+message);
//
//    }
//    @PreDestroy
//    public void cleanUp(){
//        System.out.println("chuẩn bị destroy mọi ng tránh ra!");
//    }
}
