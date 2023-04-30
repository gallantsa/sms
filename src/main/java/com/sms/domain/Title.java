package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Title {
    @TableField("titleNo")
    private String titleNo;
    @TableField("titleName")
    private String titleName;
    @TableField("teacherNo")
    private String teacherNo;
}
