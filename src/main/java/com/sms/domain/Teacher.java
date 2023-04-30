package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Teacher extends User{
    @TableField("teacherNo")
    private String teacherNo;
    @TableField("teacherName")
    private String teacherName;
    @TableField("instituteNo")
    private String instituteNo;
}
