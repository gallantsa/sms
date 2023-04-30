package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Institute {
    @TableField("instituteNo")
    private String instituteNo;
    @TableField("instituteName")
    private String instituteName;
}
