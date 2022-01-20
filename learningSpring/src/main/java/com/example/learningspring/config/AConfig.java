package com.example.learningspring.config;

import com.example.learningspring.bean.TestConfigImportA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {
    @Bean(name = "configA")
    public TestConfigImportA testConfig(){
        TestConfigImportA config = new TestConfigImportA();
        config.setName("duong co nuong");
        return config;
    }
}
