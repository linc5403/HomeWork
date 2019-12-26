package com.ql.service;

import com.ql.domain.Person;
import com.ql.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:54 下午
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> queryById(int id) {
        return personMapper.queryById(id);
    }
}
