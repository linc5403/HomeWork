package club.banyuan.myblog.service.serviceImpl;

import club.banyuan.myblog.annotation.LoggerAnnotation;
import club.banyuan.myblog.dao.BlogDao;
import club.banyuan.myblog.dao.CommentDao;
import club.banyuan.myblog.module.Blog;
import club.banyuan.myblog.module.Comment;
import club.banyuan.myblog.service.BlogService;
import club.banyuan.myblog.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private Logger logger = LoggerFactory.getLogger(CommentServiceImpl.class);

    @Autowired
    CommentDao commentDao;

    @LoggerAnnotation
    @Override
    public Comment selectCommentById(Integer id) {
        return null;
    }

    @LoggerAnnotation
    @Override
    public PageInfo selectCommentByBlogId(Integer page,Integer size,Integer id) {
        PageHelper.startPage(page,size);
        PageInfo pageInfo=new PageInfo(commentDao.selectCommentByBlogId(id));
        return pageInfo;
    }
}
