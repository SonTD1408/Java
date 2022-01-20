package com.example.learningspring.bean;

public class BaseBeanForInjection {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printProperty(){
        System.out.println(name);
    }
}
