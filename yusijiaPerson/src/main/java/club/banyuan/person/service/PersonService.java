package club.banyuan.person.service;

import club.banyuan.person.module.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    List<Person> findAllById(Iterable<Integer> iterable);

    Person  saveAndFlush(Person person);

}
