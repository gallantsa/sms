package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class Manager extends User{
    @TableField("managerNo")
    private String managerNo;
    @TableField("managerName")
    private String managerName;
    @TableField("phoneNum")
    private String phoneNum;
}
