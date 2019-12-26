package club.banyuan.springboot;


import club.banyuan.spring.entity.Users;
import club.banyuan.spring.mapper.UsersMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @author 陈浩
 * @date Created on 2019/12/20
 */
public class JunitTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //1.读取mybatis配置文件创建sqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    @Test
    public void Tests() {
//        //2.获取sqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //3.获取对应mapper
//        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
//        //4.执行查询语句并返回结果
//        UsersExample usersExample=new UsersExample();
//        usersExample.createCriteria().andNameEqualTo("陈浩");
//        List<Users> users=usersMapper.selectByExample(usersExample);
//        System.out.println(users);
//        System.out.println("byebye");
    }

    @Test
    public void Test2() {
        //2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取对应mapper
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        //4.执行查询语句并返回结果
        List<Users> users = usersMapper.selectByName("陈浩","12");
        System.out.println(users);
    }
    @Test
    public void Test3() {
        //2.获取sqlSession

        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.获取对应mapper
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        //4.执行查询语句并返回结果
        Users user=new Users();
        user.setName("陈浩");
        user.setLoginname("12");
        List<Users> users = usersMapper.selectByUser(user);
        System.out.println(users);
    }
}
