package club.banyuan.springbootmybatis.controller;

import club.banyuan.springbootmybatis.bean.User;
import club.banyuan.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUser() {
        return userService.selectAllUser();
    }
}
