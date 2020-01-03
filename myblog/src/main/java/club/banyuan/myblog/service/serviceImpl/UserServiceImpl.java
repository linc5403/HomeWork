package club.banyuan.myblog.service.serviceImpl;

import club.banyuan.myblog.dao.UserDao;
import club.banyuan.myblog.module.User;
import club.banyuan.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public User login(String name, String password) {
        User user = userDao.login(name);
        return (password.equals(user.getPassword())) ? user : null;
    }
}
