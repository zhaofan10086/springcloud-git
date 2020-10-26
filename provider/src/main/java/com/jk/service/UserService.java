package com.jk.service;

import com.jk.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserService {

    List<User> findAll(User user);

    void addUser(User user);

    User findUserById(Integer id);

    void updateUser(User user);

    void deleteByIds(String[] ids);
}
