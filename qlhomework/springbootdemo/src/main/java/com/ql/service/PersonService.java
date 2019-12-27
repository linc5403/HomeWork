package com.ql.service;

import com.ql.domain.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:53 下午
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public interface PersonService {
    List<Person> queryById(int id);
}
