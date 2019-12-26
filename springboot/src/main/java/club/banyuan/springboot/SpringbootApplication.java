package club.banyuan.springboot;

import club.banyuan.spring.entity.Users;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 陈浩
 */
@SpringBootApplication
@MapperScan("club.banyuan.springboot.mapper")
public class SpringbootApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class);

    public static void main(String[] args) {

        ApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
        SearchImpl bean1= run.getBean(SearchImpl.class);
        SearchImpl bean2= run.getBean(SearchImpl.class);
        int result = bean1.result(new int[]{2, 1, 3, 10, 5, 8, 9, 4}, 10);
        // System.out.println(result);
       // logger.warn(result + "");
        Sort a1 = bean1.getBubble();
        Sort a2 = bean2.getBubble();

        logger.info("" + a1);
        logger.info("" + a2);
        logger.info("{}", a1.hashCode()==a2.hashCode());
    }
}
