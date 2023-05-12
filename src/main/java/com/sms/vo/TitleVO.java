package com.sms.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.sms.domain.Title;
import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class TitleVO{
    @TableField("titleNo")
    private String titleNo;
    @TableField("titleName")
    private String titleName;
    @TableField("teacherName")
    private String teacherName;
}
