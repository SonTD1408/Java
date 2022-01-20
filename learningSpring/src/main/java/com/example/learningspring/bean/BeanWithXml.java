package com.example.learningspring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanWithXml {
    public String name;
    public String thisIsAProperty;
    public void setName(String name){
        this.name=name;
    }
    public void setThisIsAProperty(String thisIsAProperty){
        this.thisIsAProperty = thisIsAProperty;
    }

    public void printProperty(){
        System.out.println(this.name+  " "+ this.thisIsAProperty);
    }

    @PostConstruct
    public void initIt(){
        System.out.println("sau khi khơi tạo message có giá trị: "+name);

    }
    @PreDestroy
    public void cleanUp(){
        System.out.println("chuẩn bị destroy mọi ng tránh ra!");
    }
}
