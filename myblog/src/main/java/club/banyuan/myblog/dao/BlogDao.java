package club.banyuan.myblog.dao;

import club.banyuan.myblog.module.Blog;
import club.banyuan.myblog.module.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogDao {
    Blog selectBlogById(Integer id);
    List<Blog> selectBlogByUserName(String name);
}
