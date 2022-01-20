package com.example.learningspring.config;

import com.example.learningspring.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AConfig.class, HelloWorldConfig.class})
public class AppConfig {
}
