package com.sms.dto;

import lombok.Data;
/**
 * @author 王伟立
 * @version 1.0
 */

@Data
public class PublishTitleDTO {
    private String titleNo;
    private String titleName;//选题名称
    private String titleType;//选题类型
    private String description;
    private int maxSelectCount;// 选题最大学生数
}
