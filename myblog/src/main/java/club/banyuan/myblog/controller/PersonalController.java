package club.banyuan.myblog.controller;

import club.banyuan.myblog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
//@RequestMapping("/user")
public class PersonalController {

    private Logger logger= LoggerFactory.getLogger(PersonalController.class);

    @Autowired
    UserService userService;

    @GetMapping("/{username}")
    public String personalGet(@PathVariable("username") String username,
                              @RequestParam("page")Optional<Integer> page,
                              @RequestParam("size")Optional<Integer> size){
        logger.info("进入Person"+username);
        return "list";
    }

}
