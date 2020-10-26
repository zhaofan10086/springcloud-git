package com.jk.service.hystrix;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceHystrix implements UserService{


    @Override
    public String hello() {
        return null;
    }

    @Override
    public List<User> findAll(User user) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteByIds(String[] ids) {

    }
}
