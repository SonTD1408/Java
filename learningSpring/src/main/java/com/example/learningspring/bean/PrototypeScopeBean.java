package com.example.learningspring.bean;

public class PrototypeScopeBean {
    public String ms;

    public void setMs(String ms) {
        this.ms = ms;
    }

    public void printProperty(){
        System.out.println(this.ms);
    }
}
