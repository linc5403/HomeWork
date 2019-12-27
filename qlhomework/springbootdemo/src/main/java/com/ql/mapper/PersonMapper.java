package com.ql.mapper;

import com.ql.domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description
 * @author：QL
 * @date:Created in 2019/12/25 4:46 下午
 */
@Mapper//表示本类是mybatis的mapper类
//为了给mapper接口 自动根据一个添加@Mapper注解的接口生成一个实现类
@Repository
public interface PersonMapper {
    List<Person> queryById(int id);
}
