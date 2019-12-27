package club.banyuan.control;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author 崔英俊
 * @date 2019/12/26
 * @version 1.0
 */
@Aspect
@Component
public class LogWriter {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Pointcut("@annotation(club.banyuan.control.Logging)&&args(a,b)")
    public void pointCut(int a, String b){

    }
    @Before("pointCut(a,b)")
    public  void doSomethingBefore(int a, String b){
        logger.error("张宇来了");
        logger.error(String.valueOf(a)+b);

    }
    @AfterReturning( value = "pointCut(a,b)",returning ="val")
    public  void doSomethingAfter(int a, String b, int val){
        logger.error("张宇走了");
        logger.error(String.valueOf(a)+b);
        logger.error("返回值是"+val);

    }
}
