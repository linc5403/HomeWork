package club.banyuan.controller;

import club.banyuan.bean.Blog;
import club.banyuan.bean.Comment;
import club.banyuan.bean.User;
import club.banyuan.form.BlogCreateForm;
import club.banyuan.service.BlogService;
import club.banyuan.service.CommentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;
    private final CommentService commentService;

    @Autowired
    public BlogController(BlogService blogService, CommentService commentService) {
        this.blogService = blogService;
        this.commentService = commentService;
    }

    @GetMapping
    @ResponseBody
    public PageInfo getBlogs(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> size,
            @RequestParam Optional<String> sort,
            @RequestParam Optional<String> order
            )
    {
        return blogService.listBlogs(page.orElse(1), size.orElse(5),
                sort.orElse("created_time"), order.orElse("desc"));
    }

    @PostMapping
    public String post(
            @Valid BlogCreateForm form,
            BindingResult result,
            HttpSession session
    ) {
        User user = (User)session.getAttribute("CURRENT_USer");
        Blog blog = form.toBlog(user);
        blogService.createBlog(blog);
        return "redirect:/blogs/" + blog.getId();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Blog get(@PathVariable("id") int id, Model model) {
        // Your Code goes here
        Blog blog = blogService.findBlog(id);
/*        List<Comment> comments = commentService.getCommentOfBlog(blog);
        model.addAttribute("blog", blog);
        model.addAttribute("comments", comments);*/
        return blog;
    }

    @GetMapping("/create")
    public String get() {
        System.out.println("/posts/create!!!!!!!!!!!!!!!!");
        return "create";
    }


}
