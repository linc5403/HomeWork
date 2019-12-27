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
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //1.pointcut
    //2.一个空函数去执行，目的是为了简化代码流程
    @Pointcut("@annotation(club.banyuan.springboot.Logging)&&args(a,b)")
    public void pointCut(int[] a, int b) {
    }

    //3。具体做的事情Advice
    @Before(value = "pointCut(a, b)")
    public void doSomethingBefore(int[] a, int b) {
        logger.info("这个是传入的要查询的数======>" + b);
        for (int m : a) {
            logger.info("这个是传入的数组------>" + m);
        }

    }


    @AfterReturning(returning = "rel", value = "pointCut(a,b)")
    public void doSomethingAfter(int[] a, int b, int rel) {

        logger.info("这是返回值+++++++>" + rel);

    }

}

