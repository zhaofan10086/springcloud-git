package com.jk.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String userId;
    private String userName;
    private String password;
    private Integer sex;
    private String hobby;
    private Integer levelId;
    private String levelName;
    private Date createTime;
}
