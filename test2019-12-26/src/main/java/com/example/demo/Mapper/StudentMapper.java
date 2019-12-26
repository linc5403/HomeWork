package com.example.demo.Mapper;

import com.example.demo.PoJo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StudentMapper {
    @Select("select * from student where id=#{id}")
    Student selectstudent(@Param("id") int id);
}
