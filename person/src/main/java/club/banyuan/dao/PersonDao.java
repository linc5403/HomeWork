package club.banyuan.dao;

import club.banyuan.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 陈浩
 * @date Created on 2019/12/25
 */
public interface PersonDao extends JpaRepository<Person, Integer> {
    @Override
    List<Person> findAll();

    @Override
    List<Person> findAllById(Iterable<Integer> iterable);

    @Override
    <S extends Person> S save(S s);

}
