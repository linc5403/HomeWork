package club.banyuan;

import club.banyuan.bean.Blog;
import club.banyuan.dao.BlogDao;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@MapperScan("club.banyuan.dao")
public class BlogApplication {
    private static Logger logger = LoggerFactory.getLogger(BlogApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);

        BlogDao blogDao = context.getBean(BlogDao.class);
        List<Blog> blogs = blogDao.findBlogsByUserId(1);
        for (Blog b: blogs) {
            logger.info("{}", b.toString());
        }


       /* Integer[] a = new Integer[] {1, 2, 3};
        List<Integer> la = Arrays.asList(a);
        Set<Integer> sa = new HashSet<Integer>(la);
        */

       /*
        BlogService blogService = context.getBean(BlogService.class);
        Blog blog10 = blogService.findBlog(10);
        logger.debug("{}", blog10);
        UserDao userDao = context.getBean(UserDao.class);
        User user1 = userDao.selectUserByName("aa");
        PageInfo pageInfo = blogService.findBlogsByUser(user1, 0, 10);
        logger.info("{}", pageInfo);
*/
       /* Blog blog = new Blog();
        blog.setAuthor(user1);
        for (int i = 11; i <= 100; i++) {
            String title = "标题" + i;
            blog.setTitle(title);
            String content = "内容";
            for (int j = 0; j < 10; j++)
                content = content + i + " ";
            blog.setContent(content);
            blogService.createBlog(blog);
            System.out.println(blog);
        }*/
    }

}
