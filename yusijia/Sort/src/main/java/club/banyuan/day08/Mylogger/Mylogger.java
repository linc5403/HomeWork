package club.banyuan.day08.Mylogger;

import club.banyuan.day08.search.QuickSearch;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

@Aspect
@Component
public class Mylogger {
    private Logger logger=LoggerFactory.getLogger(Mylogger.class);

    @Pointcut("@annotation(club.banyuan.day08.Myinterface)")
    public void pointcut(){
        logger.info("pointCurrent");
    }

    @Before(value = "pointcut()")
    public void pointBefore(JoinPoint joinPoint){
        logger.info("pointBefore");
        Object [] object =joinPoint.getArgs();
//        for (Object o:object) {
            logger.info("输入数组={}",object[0]);
//        }
    }


    @AfterReturning(value = "pointcut()",returning = "result")
    public void pointAfter(JoinPoint joinPoint,Object result){
        logger.info("pointAfter");
        logger.info("返回数组={}",joinPoint.getArgs()[0]);
        logger.info("返回值={}",result);
    }
}
