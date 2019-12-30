package club.banyuan.springbootmybatis.controller;

import club.banyuan.springbootmybatis.bean.User;
import club.banyuan.springbootmybatis.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    private final Integer PAGE = 1;
    private final Integer SIZE = 5;

    @GetMapping("/")
    public PageInfo getAllUser(
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> size
    ) {
        PageHelper.startPage(page.orElse(PAGE), size.orElse(SIZE), "name asc");
        return new PageInfo(userService.selectAllUser());
    }
}
