package club.banyuan.service;

import club.banyuan.dao.UserStub;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public UserStub findByName(String name) {
        UserStub user = new UserStub(name,
                (int)(Math.random() * 10000),
                (int)(Math.random()*(100-10) + 10));
        return user;
    }
}
