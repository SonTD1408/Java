package com.example.learningspring.bean;

import org.springframework.stereotype.Component;

@Component("component1")
public class TestComponent1 {
    @Override
    public String toString(){
        return "Hello, this is component 1";
    }
}
