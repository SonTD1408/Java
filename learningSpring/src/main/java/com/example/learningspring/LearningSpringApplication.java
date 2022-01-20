package com.example.learningspring;

import com.example.learningspring.bean.BaseBeanForInjection;
import com.example.learningspring.bean.BeanWithXml;
import com.example.learningspring.bean.HelloWorld;
import com.example.learningspring.bean.TestConfigImportA;
import com.example.learningspring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearningSpringApplication {
    public static void main(String[] args) {
//  create bean config by annotation and @Import
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) annotationContext.getBean("configHelloWorld");
        TestConfigImportA aConfig = (TestConfigImportA) annotationContext.getBean("configA");

//        helloWorld.printProperty();
//        aConfig.printProperty();
//  create bean with xml
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        BeanWithXml firstBean = (BeanWithXml) context.getBean("firstBean");
//        firstBean.printProperty();
//  inject value
        BaseBeanForInjection baseBeanForInjection = (BaseBeanForInjection) context.getBean("baseBeanForInjection");
        baseBeanForInjection.printProperty();
    }
}
