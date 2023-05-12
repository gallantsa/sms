package com.sms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
@TableName("selecttitle")
public class SelectTitle {

    @TableId(value = "titleNo", type = IdType.ASSIGN_ID)
    private String titleNo;
    @TableField("studentNo")
    private String studentNo;
    @TableField("teacherNo")
    private String teacherNo;

}
