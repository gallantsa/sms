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
@TableName("publishtitle")
public class PublishTitle {

    @TableId(value = "titleNo", type = IdType.ASSIGN_ID)
    private String titleNo;
    @TableField("teacherNo")
    private String teacherNo;
    @TableField("status")
    private String status; // 是否被选
}
