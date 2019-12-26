package club.banyuan.person.service.serviceImpl;

import club.banyuan.person.dao.PersonDao;
import club.banyuan.person.module.Person;
import club.banyuan.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public List<Person> findAllById(Iterable<Integer> iterable) {
        return personDao.findAllById(iterable);
    }

    @Override
    public Person saveAndFlush(Person person) {
        return personDao.saveAndFlush(person);
    }
}
