package com.sms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Teacher{
    //设置主键, id是自定义生成策略
    @TableId(value = "teacherNo", type = IdType.ASSIGN_ID)
    private String teacherNo;
    @TableField("teacherName")
    private String teacherName;
    @TableField("instituteNo")
    private String instituteNo;
}
