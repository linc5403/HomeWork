package club.banyuan.service;

import club.banyuan.dao.BlogStub;
import club.banyuan.dao.UserStub;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class BlogService {
    public List<BlogStub> findByUser(UserStub user) {
        List<BlogStub> blogs = new ArrayList<>();
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        IntStream.range(0, 10).forEachOrdered(i -> {
            rightNow.add(Calendar.DAY_OF_YEAR, -1);
            BlogStub blog = new BlogStub("title" + i,
                    "content" + i, rightNow.getTime());
            blog.setAuthor(user.getName());
            blogs.add(blog);
        });
        return blogs;
    }
}
