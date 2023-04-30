package com.sms.dto;

import lombok.Data;

/**
 * @author 王伟立
 * @version 1.0
 */
@Data
public class SelectTitleDTO {
    private Long id;
    private String titleName;
    private String teacherName;
    private String instituteName;
    private String titleType;
    private int currentSelectCount;
    private int totalSelectCount;
}
