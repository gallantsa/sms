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
public class Student {
    @TableId(value = "studentNo", type = IdType.ASSIGN_ID)
    private String studentNo;
    @TableField("studentName")
    private String studentName;
    @TableField("classNo")
    private String classNo;
}
