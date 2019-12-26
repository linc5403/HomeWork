package club.banyuan.dao;

import club.banyuan.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created on 2019/12/25 4:58 下午
 *
 * @author lgt
 */
public interface PersonDao extends JpaRepository<Person,Integer> {
    @Override
    List<Person> findAll();

    @Override
    List<Person> findAllById(Iterable<Integer> iterable);

    @Override
    <S extends Person> S save(S s);
}
