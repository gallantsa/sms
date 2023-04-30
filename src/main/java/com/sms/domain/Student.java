package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */

@Data
public class Student extends User{
    @TableField("studentNo")
    private String studentNo;
    @TableField("studentName")
    private String studentName;
    @TableField("classNo")
    private String classNo;
}
