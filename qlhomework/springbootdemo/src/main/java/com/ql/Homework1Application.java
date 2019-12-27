package com.ql;

import com.ql.controller.PersonController;
import com.ql.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class Homework1Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Homework1Application.class, args);
        Object personcontroller1 = context.getBean(PersonController.class);
        Object personcontroller2 = context.getBean(PersonController.class);
        PersonService s1 = context.getBean(PersonService.class);
        PersonService s2 = context.getBean(PersonService.class);
        System.out.print("内service");
        System.out.println(s1==s2);
        System.out.print("外controller");
        System.out.println(personcontroller1==personcontroller2);
    }

}
