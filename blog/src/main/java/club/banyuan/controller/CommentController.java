package club.banyuan.controller;

import club.banyuan.bean.Comment;
import club.banyuan.bean.User;
import club.banyuan.service.BlogService;
import club.banyuan.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {
    private final CommentService commentService;
    private final BlogService blogService;

    @Autowired
    public CommentController(CommentService commentService, BlogService blogService) {
        this.commentService = commentService;
        this.blogService = blogService;
    }

    @PostMapping("/blogs/{id}/comments")
    String post(@PathVariable int id,
                User user,
                @RequestParam String content) {
        Comment c = new Comment();
        c.setContent(content);
        c.setCommenter(user);
        c.setBlog(blogService.findBlog(id));
        commentService.createComment(c);
        return "redirect:/blogs/" + id;
    }
}
