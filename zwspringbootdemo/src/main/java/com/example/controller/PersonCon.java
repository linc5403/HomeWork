package com.example.controller;

import com.example.entity.Person;
import com.example.mapper.IPersonmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/12/25
 * @Description: com.example.controller
 * @version: 1.0
 */
@Controller
//@RestController
public class PersonCon {

    @Autowired
    private IPersonmapper IPersonmapper;

    @RequestMapping("/test")
    @ResponseBody
    public List<Person> queryUser() {
        List<Person> users = IPersonmapper.findAll();
        System.out.println(users);
        return users;
    }

//    @RequestMapping("/test")
////    @ResponseBody
//    public String queryUser() {
//        System.out.println("AAAAAAAA");
//        return "ty";
//    }
}


