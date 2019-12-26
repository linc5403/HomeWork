package club.banyuan.person.controller;

import club.banyuan.person.module.Person;
import club.banyuan.person.service.PersonService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.BufferedInputStream;
import java.io.IOException;

@Controller
public class PersonController {

    private Logger logger= LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;
    @Autowired
    DataSource dataSource;

    @PostMapping("/addPerson")
    public String addPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("addPerson-------------------");
        BufferedInputStream inputStream=new BufferedInputStream(request.getInputStream());
        Person person=JSON.parseObject(inputStream,Person.class);
        personService.saveAndFlush(person);
        return JSON.toJSONString(person);
    }
}
