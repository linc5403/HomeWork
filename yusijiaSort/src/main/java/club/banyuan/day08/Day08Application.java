package club.banyuan.day08;

import club.banyuan.day08.search.BubbleSearch;
import club.banyuan.day08.search.QuickSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Queue;

@SpringBootApplication
public class Day08Application {
    private  static Logger logger = LoggerFactory.getLogger(Day08Application.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(Day08Application.class, args);
        QuickSearch quickSearch = applicationContext.getBean(QuickSearch.class);
        int index = quickSearch.search(new int[]{2, 3, 564, 1, 34, 23}, 34);
        logger.info("{}",index);
//        QuickSearch quickSearch1=new QuickSearch();
//        QuickSearch quickSearch2=new QuickSearch();
        QuickSearch quickSearch1=applicationContext.getBean(QuickSearch.class);
        QuickSearch quickSearch2=applicationContext.getBean(QuickSearch.class);
        logger.info("{}",quickSearch1.getSort().equals(quickSearch2.getSort()));
    }

}
