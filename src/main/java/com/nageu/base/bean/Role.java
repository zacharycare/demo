package com.nageu.base.bean;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * author : zhou
 * datetime : 2017/9/8 15:52
 */
@Data
@TableName("role")
public class Role implements Serializable {
    private String id;
    private String role_name;
    private String description;
    private String state;
}
