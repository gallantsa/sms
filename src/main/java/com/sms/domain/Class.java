package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
@TableName("Class")
public class Class {
    @TableField("classNo")
    private String classNo;
    @TableField("className")
    private String className;
    @TableField("specialityNo")
    private String specialityNo;
}
