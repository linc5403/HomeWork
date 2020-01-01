package com.tianmaying.controller;

import com.tianmaying.model.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/{username}")
    public List<Blog> getByPage(@PathVariable("username") String username,
                                @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                @RequestParam(value = "size", required = false, defaultValue = "10") int size) {
        //Your code goes here
        return null;
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

}
