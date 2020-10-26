package com.jk.service;

import com.jk.entity.User;
import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value ="provider",fallback= UserServiceHystrix.class)
public interface UserService {
    @RequestMapping("/hello")
    public String hello();
    /**
     * 列表
     * @param user
     * @return
     */
    @RequestMapping("/user/findAll")
    public List<User> findAll(@RequestBody User user);

    /**
     * 新增
     * @param user
     */
    @RequestMapping("/user/addUser")
    public void addUser(@RequestBody User user);

    /**
     * 回显
     * @param id
     * @return
     */
    @RequestMapping("/user/findUserById")
    public User findUserById(@RequestParam(value="id") Integer id);

    /**
     * 修改
     * @param user
     */
    @RequestMapping("/user/updateUser")
    public void updateUser(@RequestBody User user);

    @RequestMapping("/user/deleteByIds")
    public void deleteByIds(@RequestParam(value="ids") String[] ids);
}
