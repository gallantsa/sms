package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Speciality {
    @TableField("specialityNo")
    private String specialityNo;
    @TableField("specialityName")
    private String specialityName;
    @TableField("instituteNo")
    private String instituteNo;
}
