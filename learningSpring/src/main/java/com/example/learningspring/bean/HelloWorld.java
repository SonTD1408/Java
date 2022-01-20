package com.example.learningspring.bean;

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
}
