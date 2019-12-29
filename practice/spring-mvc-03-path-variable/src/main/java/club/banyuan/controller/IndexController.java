package club.banyuan.controller;

import club.banyuan.dao.BlogStub;
import club.banyuan.dao.UserStub;
import club.banyuan.service.BlogService;
import club.banyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
