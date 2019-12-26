package com.example.demo.Controller;

import com.example.demo.Mapper.StudentMapper;
import com.example.demo.PoJo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Control {
    @Autowired
    StudentMapper studentMapper;
    @RequestMapping("select")
    @ResponseBody
    public Student select(@RequestParam("id") int id){
        return  studentMapper.selectstudent(id);
    }
}
