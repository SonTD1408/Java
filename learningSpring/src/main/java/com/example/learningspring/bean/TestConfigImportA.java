package com.example.learningspring.bean;

public class TestConfigImportA {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printProperty(){
        System.out.println(name);
    }
}
