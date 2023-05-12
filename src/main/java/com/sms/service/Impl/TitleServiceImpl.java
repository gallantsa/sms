package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.TitleDao;
import com.sms.domain.Title;
import com.sms.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class TitleServiceImpl extends ServiceImpl<TitleDao, Title> implements TitleService {

    @Autowired
    private TitleDao titleDao;


    public String getTitleNoByTitleName(String titleName) {
        return titleDao.getTitleNoByTitleName(titleName);
    }

    public List<Title> getAllPublishTitle(String teacherNo){
        return titleDao.getAllPublishTitle(teacherNo);
    }


    public List<Title> getAllPublishedTitle(String teacherNo){
        return titleDao.getAllPublishedTitle(teacherNo);
    }
}
