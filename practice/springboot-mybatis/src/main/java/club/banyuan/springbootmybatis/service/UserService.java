package club.banyuan.springbootmybatis.service;

import club.banyuan.springbootmybatis.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import club.banyuan.springbootmybatis.dao.UserDao;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAllUser() {
        return userDao.findAllUser();
    }
}
