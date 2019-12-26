package com.banyuan.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogWriter {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Pointcut("@annotation(com.banyuan.demo.logging)")
    public void pointCut(){}

    @Before(value="pointCut()")
    public void doSomethingBefore(){
    logger.info("Do something Before");
    }

    @After(value="pointCut()")
    public void doSomethingAfter(){
    logger.info("Do something After");}
}
