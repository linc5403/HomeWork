package club.banyuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    private final BlogService blogService;

    @Autowired
    public IndexController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/{username}")
    //使用@RequestParam获取参数
    public String get(@PathVariable("username") String username, Model model) {
        // Your Code goes here
        // 渲染模板list.html
        return "list";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
