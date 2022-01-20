package com.example.learningspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("component2")
public class TestComponent2 {
    @Autowired
    public TestComponent1 testComponent1;

    @Override
    public String toString(){
        return "component2 : [component1 = "+testComponent1+"]";
    }
}
