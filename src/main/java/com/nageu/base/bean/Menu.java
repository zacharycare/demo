package com.nageu.base.bean;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@TableName("menu")
public class Menu implements Serializable {
    private String id;
    private String pid;
    private int level;
    private String name;
    private String url;
    private String icon;
    private int sort;
    private String create_id;
    private String create_time;
    private String description;
    @TableField(exist = false)
    private List<Menu> children = new ArrayList<>();
}
