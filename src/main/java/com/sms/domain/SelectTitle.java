package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class SelectTitle {

    @TableField("titleNo")
    private String titleNo;
    @TableField("studentNo")
    private String studentNo;
    @TableField("teacherNo")
    private String teacherNo;

}
