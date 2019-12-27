package com.ql.service;

import com.ql.Homework1Application;
import com.ql.domain.Person;
import com.ql.mapper.PersonMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:54 下午
 */
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> queryById(int id) {
        return personMapper.queryById(id);

    }
}
