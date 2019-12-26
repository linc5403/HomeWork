package club.banyuan.day01.dao;

import club.banyuan.day01.model.Person;
import club.banyuan.day01.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Person,Integer> {
    @Override
    List<Person> findAll();
    @Override
    List<Person> findAllById(Iterable<Integer> iterable);
    @Override
    <S extends Person> S save(S s);
}
