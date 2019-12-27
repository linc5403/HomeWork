package club.banyuan.dao;

import club.banyuan.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 崔英俊
 * @date 2019/12/26
 * @version 1.0
 */
public interface PersonDao extends JpaRepository<Person,Integer> {
    @Override
    List<Person> findAll();

    @Override
    List<Person> findAllById(Iterable<Integer> iterable);

    @Override
    <S extends Person> S save(S s);
}
