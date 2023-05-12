package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.domain.PublishTitle;
import com.sms.domain.Title;
import com.sms.service.TitleService;
import com.sms.service.TitleVOService;
import com.sms.vo.TitleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@RestController
@RequestMapping("/titles")
public class TitleController {
    @Autowired
    private TitleService titleService;

    /**
     * 获得所有题目信息
     * @return
     */
    @GetMapping
    public List<Title> listAllTitles() {
        return titleService.list();
    }
}
