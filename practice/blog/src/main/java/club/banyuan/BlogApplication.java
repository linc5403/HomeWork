package club.banyuan;

import club.banyuan.bean.User;
import club.banyuan.dao.BlogDao;
import club.banyuan.dao.CommentDao;
import club.banyuan.dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("club.banyuan.dao")
public class BlogApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);
        UserDao userDao = context.getBean(UserDao.class);
        User user1 = userDao.selectUserByName("aa");
        User user2 = userDao.selectUserByName("王二");
        System.out.println(user1);
        System.out.println(user2);
        BlogDao blogDao = context.getBean(BlogDao.class);
        System.out.println(blogDao.findBlogsByUserId(1));
/*        PageHelper.startPage(0, 10);
        System.out.println(blogDao.findBlogById(1));
        System.out.println(new PageInfo(blogDao.findBlogsByUsername("aa")));
        CommentDao commentDao = context.getBean(CommentDao.class);
        System.out.println(commentDao.finCommentsByBlogId(1));
        System.out.println("start...");*/
    }

}
