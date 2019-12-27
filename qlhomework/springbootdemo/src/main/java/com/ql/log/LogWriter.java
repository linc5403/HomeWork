package com.ql.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/26 4:26 下午
 */
@Aspect
@Component
public class LogWriter {
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
//@Pointcut("@annotation(com.ql.log)")
    public void pointCut() {

    }
//    @Before(value = "pointCut()")
    public void doSomethingBefore(){
        logger.info("before");
    }
//    @After(value = )
    public void doSomethingAfter(){
        logger.info("after");
    }

}
