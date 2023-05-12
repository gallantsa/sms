package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.domain.PublishTitle;
import com.sms.domain.SelectTitle;
import com.sms.domain.Title;
import com.sms.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@RestController
@RequestMapping("/publishTitle")
public class PublishTitleController {

    @Autowired
    private PublishTitleService publishTitleService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private TitleService titleService;

    @Autowired
    private SelectTitleService selectTitleService;

    /**
     * 老师出题 - 从题库中选题
     * @param request
     * @param titleNo
     * @return
     */
    @PostMapping("/{titleNo}")
    public boolean publishTitle(HttpServletRequest request, @PathVariable String titleNo) {
        HttpSession session = request.getSession();
        PublishTitle publishTitle = new PublishTitle();
        publishTitle.setTitleNo(titleNo);
        publishTitle.setStatus("0");
        String teacherNo = teacherService.getTeacherNo((String) session.getAttribute("user"));

        // 如何获得登录的教师的编号
        publishTitle.setTeacherNo(teacherNo);
        return publishTitleService.save(publishTitle);
    }

    /**
     * 老师删除题目 - 待完善 Todo
     * @param titleNo
     * @return
     */
    @DeleteMapping("/{titleNo}")
    public boolean deleteTitle(@PathVariable("titleNo") String titleNo){
        return publishTitleService.removeById(titleNo);
    }

    /**
     * 展示所有老师已出的题目
     * @return
     */
    @GetMapping("/published")
    public List<Title> getAllPublishedTitle(HttpServletRequest request){
        HttpSession session = request.getSession();
        String userNo = (String)session.getAttribute("user");
        String teacherNo = teacherService.getTeacherNo(userNo);
        return titleService.getAllPublishedTitle(teacherNo);
    }

    @GetMapping
    public List<Title> getAllPublishTitle(HttpServletRequest request){
        HttpSession session = request.getSession();
        String userNo = (String)session.getAttribute("user");
        String teacherNo = teacherService.getTeacherNo(userNo);
        return titleService.getAllPublishTitle(teacherNo);
    }


}
