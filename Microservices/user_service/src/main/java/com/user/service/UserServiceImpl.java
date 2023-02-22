package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

//    fake user lsit

    List<User> list = List.of(
            new User(1311L,"Rahman","12345"),
            new User(1312L,"Margub","12346"),
            new User(1313L,"Tannu","12347")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
