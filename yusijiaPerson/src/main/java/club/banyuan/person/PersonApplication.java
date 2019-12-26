package club.banyuan.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PersonApplication {
    private static Logger logger = LoggerFactory.getLogger(PersonApplication.class);

    public static void main(String[] args) {
        logger.debug("Spring=====================");
        SpringApplication.run(PersonApplication.class, args);
    }

}
