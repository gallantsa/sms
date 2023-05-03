package com.sms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class User {
    @TableField("userNo")
    private String userNo;
    private String password;
    @TableField("userName")
    private String userName;
    private String identity;
}
