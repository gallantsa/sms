package com.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sms.domain.Title;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
public interface TitleService extends IService<Title> {
    String getTitleNoByTitleName(String titleName);

    List<Title> getAllPublishTitle(String teacherNo);

    List<Title> getAllPublishedTitle(String teacherNo);
}
