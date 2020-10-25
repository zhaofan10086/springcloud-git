package com.jk.service;

import com.jk.entity.User;
import com.jk.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> findAll(User user) {
        return userMapper.findAll(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void deleteByIds(String[] ids) {
        userMapper.deleteByIds(ids);
    }
}
