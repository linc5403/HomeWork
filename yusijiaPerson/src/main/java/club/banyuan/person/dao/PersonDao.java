package club.banyuan.person.dao;

import club.banyuan.person.module.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PersonDao extends JpaRepository<Person,Integer> {
    @Override
    List<Person> findAll();

    @Override
    List<Person> findAllById(Iterable<Integer> iterable);

    @Override
    <S extends Person> S saveAndFlush(S s);
    //    Person selectById(Integer Id);
//    boolean addPerson(Person person);
//    List<Person> selectAllPerson();
}
