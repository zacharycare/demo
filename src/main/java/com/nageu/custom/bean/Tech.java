package com.nageu.custom.bean;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * author : zhou
 * datetime : 2017/9/15 14:50
 */
@Data
@TableName("tech")
public class Tech implements Serializable {
    @TableId(type = IdType.INPUT)
    private int id;
    private String title;
    private String content;
    private String createTime;
}
