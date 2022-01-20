package com.example.learningspring.bean;

public class SingletonScopeBean {
    public String ms;

    public void setMs(String ms) {
        this.ms = ms;
    }
    public void printMs(){
        System.out.println(this.ms);
    }
}
