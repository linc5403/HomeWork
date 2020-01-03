package club.banyuan.myblog.controller;

import club.banyuan.myblog.annotation.LoggerAnnotation;
import club.banyuan.myblog.module.User;
import club.banyuan.myblog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Optional;

@Controller
public class loginController {

    private Logger logger = LoggerFactory.getLogger(loginController.class);

    @Autowired
    UserService userService;

    @LoggerAnnotation
    @GetMapping("/login")
    public String loginGet(@RequestParam("next") Optional<String> next) {
        return "login";
    }

    @LoggerAnnotation
    @PostMapping("/login")
    public String loginPost(@RequestParam("next") Optional<String> next,
                            @RequestParam("email") String email,
                            @RequestParam("password") String password,
                            HttpSession session) throws UnsupportedEncodingException {
        User user = userService.loginService(email, password);
        if (user != null) {
            session.setAttribute("USER_MESSAGE", user);
            return "redirect:".concat(next.orElse("/" + URLEncoder.encode("".concat(user.getName()), "utf-8")));
        } else {
            return "login";
        }
    }

}
