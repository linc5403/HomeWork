package club.banyuan.control;

import club.banyuan.dao.PersonDao;
import club.banyuan.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;

/**
 * Created on 2019/12/25 4:49 下午
 *
 * @author lgt
 */
@RestController
public class PersonControl {
    @Autowired
    PersonDao personDao;
    @Autowired
    DataSource dataSource;

    @GetMapping("/person")
    public Person person(HttpServletRequest req, HttpServletResponse resp ) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id=req.getParameter("id");
        System.out.println(id);
        List<Person> allById = personDao.findAllById(Collections.singleton(Integer.parseInt(id)));
        return allById.get(0);
    }

    @GetMapping("/personall")
    public void personall(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        List<Person> all = personDao.findAll();

        for (Person person:all) {
            resp.getWriter().write(person.toString());
            resp.getWriter().write("<br>");
        }
    }


    @PostMapping("/person")
    public void personsave(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, ParseException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String gender=req.getParameter("gender");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
//        Date date= sdf.parse(req.getParameter("date"));
        String address=req.getParameter("address");
        personDao.save(new Person(id,name,gender,address));


    }



}
