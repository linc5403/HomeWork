package com.example.mapper;

import com.example.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 张伟
 * @Date: 2019/12/25
 * @Description: com.example.dao
 * @version: 1.0
 */
@Repository
@Mapper
public interface IPersonmapper {

    public List<Person> findByid(Integer id);
    public List<Person> findAll();
}
