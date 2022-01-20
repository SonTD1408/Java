package com.example.learningspring.bean;

public class DIWithConstructor {
    public BaseBeanForInjection baseBeanForInjection;
    public DIWithConstructor(BaseBeanForInjection baseBeanForInjection){
        this.baseBeanForInjection = baseBeanForInjection;
    }
}
