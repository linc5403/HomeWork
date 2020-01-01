package club.banyuan.controller;

import club.banyuan.bean.Blog;
import club.banyuan.form.BlogCreateForm;
import club.banyuan.bean.Comment;
import club.banyuan.bean.User;
import club.banyuan.service.BlogService;
import club.banyuan.service.UserService;
import club.banyuan.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CreateBlogController {
    UserService userService;
    BlogService blogService;

    @Autowired
    public CreateBlogController(UserService userService, BlogService blogService) {
        this.userService = userService;
        this.blogService = blogService;
    }

    @GetMapping("/blogs/create")
    public String get() {
        System.out.println("/posts/create!!!!!!!!!!!!!!!!");
        return "create";
    }

    @PostMapping("/blogs")
    public String post(@Valid BlogCreateForm form, BindingResult result) {
        if (result.hasErrors())
            return "create";
        User user = userService.findByName("aa");
        Blog blog = blogService.createBlog(form.toBlog(user));
        return "redirect:/blogs/" + blog.getId();
    }
}
