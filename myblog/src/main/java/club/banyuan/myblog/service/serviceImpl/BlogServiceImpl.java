package club.banyuan.myblog.service.serviceImpl;

import club.banyuan.myblog.annotation.LoggerAnnotation;
import club.banyuan.myblog.dao.BlogDao;
import club.banyuan.myblog.dao.UserDao;
import club.banyuan.myblog.module.Blog;
import club.banyuan.myblog.module.User;
import club.banyuan.myblog.service.BlogService;
import club.banyuan.myblog.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private Logger logger = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    BlogDao blogDao;


    @LoggerAnnotation
    @Override
    public Blog selectBlogById(Integer id) {
        return blogDao.selectBlogById(id);
    }

    @LoggerAnnotation
    @Override
    public PageInfo selectBlogByUserName(Integer page,Integer size,String name) {
        PageHelper.startPage(page,size);
        PageInfo pageInfo=new PageInfo(blogDao.selectBlogByUserName(name));
        return pageInfo;
    }
}
