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
public class User {
    @TableId(value = "userNo", type = IdType.ASSIGN_ID)
    private String userNo;
    private String password;
    @TableField("userName")
    private String userName;
    private String identity;
}
