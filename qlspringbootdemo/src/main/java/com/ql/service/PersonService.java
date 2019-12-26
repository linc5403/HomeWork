package com.ql.service;

import com.ql.domain.Person;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:53 下午
 */
public interface PersonService {
    List<Person> queryById(int id);
}
