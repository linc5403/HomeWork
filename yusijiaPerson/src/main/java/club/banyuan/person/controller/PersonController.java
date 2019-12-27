package club.banyuan.person.controller;

import club.banyuan.person.module.Person;
import club.banyuan.person.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class PersonController {

    private Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;
    @Autowired
    DataSource dataSource;

    @PostMapping("/addPerson")
    public String addPerson(HttpServletRequest request, HttpServletResponse response) throws IOException, ParseException {
        logger.info("进入addPerson");
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        logger.info("{}",request.getParameter("birthday"));
        logger.info("{}",dateFormat.parse(request.getParameter("birthday")));
        Person person = new Person();
        person.setName(request.getParameter("name"));
        person.setGender(request.getParameter("gender"));
        person.setBirthday(new java.sql.Date(dateFormat.parse(request.getParameter("birthday")).getTime()));
        person.setAddress(request.getParameter("address"));
//        String name=request.getParameter("name");
//        String gender=request.getParameter("gender");
//        String birthday=request.getParameter("birthday");
//        String address=request.getParameter("address");
//        BufferedInputStream inputStream=new BufferedInputStream(request.getInputStream());
//        Person person=JSON.parseObject(inputStream,Person.class);
        logger.info("{}", person);
        personService.saveAndFlush(person);
        response.getWriter().write(person.toString());
        return person.toString();
    }
}
