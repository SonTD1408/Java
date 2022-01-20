package com.example.learningspring.bean;

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
}
