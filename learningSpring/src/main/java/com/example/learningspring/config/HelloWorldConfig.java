package com.example.learningspring.config;

import com.example.learningspring.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
    @Bean(name = "configHelloWorld")
    public HelloWorld helloWorldConfig(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("dương cô nương");
        return helloWorld;
    }
}
