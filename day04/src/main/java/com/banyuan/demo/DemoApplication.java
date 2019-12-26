package com.banyuan.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class DemoApplication {

    private  static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {

        ApplicationContext ac= SpringApplication.run(DemoApplication.class,args);
        BinarySortDemo sortDemo=  ac.getBean(BinarySortDemo.class);
        BinarySortDemo sortDemo2=  ac.getBean(BinarySortDemo.class);
//        int sort[] = sortDemo.sort(new int[]{1, 3, 4, 5, 67, 55, 45, 45, 45, 4}, 9);
//        for (int i = 0; i <sort.length ; i++) {
//            System.out.print(sort[i]+"  ");
//        }
        logger.error(" "+sortDemo.getSortDemo());
        logger.error(" "+sortDemo2.getSortDemo());
        logger.error(" "+sortDemo.getSortDemo().equals(sortDemo2.getSortDemo()));
    }}


