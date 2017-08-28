package com.nageu.base.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private char gender;
    private String state;
    private String portrait;
    private String signature;
    private String registerTime;
}
