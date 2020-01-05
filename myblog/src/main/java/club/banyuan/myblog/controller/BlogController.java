package club.banyuan.myblog.controller;

import club.banyuan.myblog.annotation.LoggerAnnotation;
import club.banyuan.myblog.module.Blog;
import club.banyuan.myblog.module.Comment;
import club.banyuan.myblog.service.BlogService;
import club.banyuan.myblog.service.CommentService;
import club.banyuan.myblog.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    private Logger logger= LoggerFactory.getLogger(BlogController.class);

    @Autowired
    BlogService blogService;
    @Autowired
    CommentService commentService;

    @LoggerAnnotation
    @GetMapping("/blogs/{id}")
    public String personalGet(@PathVariable("id") Integer id,
                              @RequestParam("page") Optional<Integer> page,
                              @RequestParam("size") Optional<Integer> size,
                              Model model){
        Blog blog=blogService.selectBlogById(id);
        List<Comment> list=commentService.selectCommentByBlogId(id);
        model.addAttribute("blog",blog);
        model.addAttribute("comments",list);
        logger.info("model: {}",model);
        return "item";
    }

}
