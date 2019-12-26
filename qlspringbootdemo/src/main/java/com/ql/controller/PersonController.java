package com.ql.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ql.domain.Person;
import com.ql.mapper.PersonMapper;
import com.ql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:21 下午
 */
@Controller//直接返回字符串
public class PersonController {
    @Autowired
    private PersonService personService;
    
    @GetMapping("/test")
    @ResponseBody
    public String test(@RequestParam("id")int id)throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> people = personService.queryById(id);
        String str = mapper.writeValueAsString(people);
        return str;
    }
}
