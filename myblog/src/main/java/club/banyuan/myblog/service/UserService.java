package club.banyuan.myblog.service;

import club.banyuan.myblog.module.User;

public interface UserService {
    User login(String email, String name);
}
