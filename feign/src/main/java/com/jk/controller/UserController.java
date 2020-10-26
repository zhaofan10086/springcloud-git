package com.jk.controller;

import com.jk.entity.User;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return userService.hello();
    }
    /**
     * 列表
     * @param user
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll(User user){
        return userService.findAll(user);
    }

    /**
     * 新增
     * @param user
     */
    @RequestMapping("/addUser")
    public void addUser(User user){
        userService.addUser(user);
    }

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("/findUserById")
    public User findUserById(@RequestParam(value="id") Integer id){
        return  userService.findUserById(id);
    }

    /**
     * 修改
     * @param user
     */
    @RequestMapping("/updateUser")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping("/deleteByIds")
    public void deleteByIds(@RequestParam(value="ids") String[] ids){
        userService.deleteByIds(ids);
    }
}
