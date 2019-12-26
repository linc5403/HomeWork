package club.banyuan.controller;

import club.banyuan.dao.PersonDao;
import club.banyuan.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 陈浩
 * @date Created on 2019/12/25
 */
@RestController
public class PersonController {
    @Autowired
    PersonDao personDao;
    @Autowired
    DataSource dataSource;

    @GetMapping("/personAll")
    public List<Person> findAll(HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=utf-8");
        List<Person> person = personDao.findAll();
        for (Person p : person) {
            resp.getWriter().write(p.toString() + "<br/>");
        }
        return null;

    }

    @GetMapping("/person")
    public List<Person> findAllById(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        List<Person> person = personDao.findAllById(Collections.singleton(Integer.parseInt(id)));
        for (Person p : person) {
            resp.getWriter().write(p.toString() + "=====>");
        }
        return null;
    }

    @PostMapping("/person")
    public void addPerson(HttpServletRequest req, HttpServletResponse resp) throws IOException, InvocationTargetException, IllegalAccessException, ParseException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String gender = req.getParameter("gender");
        String birthday = req.getParameter("birthday");
        String address = req.getParameter("address");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date parse = dateFormat.parse(birthday);


        personDao.save(new Person(name, gender, parse, address));

    }

}
