package club.banyuan;

import club.banyuan.control.PersonControl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 崔英俊
 * @date 2019/12/26
 * @version 1.0
 */
@SpringBootApplication
public class DemoApplication {
    private static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        PersonControl personControl1=run.getBean(PersonControl.class);
        PersonControl personControl2=run.getBean(PersonControl.class);

        personControl1.number(1,"lgt");
        logger.error("{}",personControl1.getPersonDao().equals(personControl2.getPersonDao()));

    }


}
