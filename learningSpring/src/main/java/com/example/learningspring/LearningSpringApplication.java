package com.example.learningspring;

import com.example.learningspring.bean.*;
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
//        baseBeanForInjection.printProperty();

//  test singleton scope
        SingletonScopeBean singletonScopeBean1 = (SingletonScopeBean) context.getBean("singletonBean");
        singletonScopeBean1.setMs("dương cô nương");
        SingletonScopeBean singletonScopeBean2 = (SingletonScopeBean) context.getBean("singletonBean");
        singletonScopeBean2.setMs("dương zui zẻ");

//        singletonScopeBean1.printMs();
//        singletonScopeBean2.printMs();
//  test prototype scope
        PrototypeScopeBean prototypeScopeBean1 = (PrototypeScopeBean) context.getBean("prototypeBean");
        prototypeScopeBean1.setMs("dương dủng dỉnh");
        PrototypeScopeBean prototypeScopeBean2 = (PrototypeScopeBean) context.getBean("prototypeBean");
        prototypeScopeBean2.setMs("dương zung zinh");

        prototypeScopeBean1.printProperty();
        prototypeScopeBean2.printProperty();
    }
}
