package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.common.Result;
import com.sms.domain.PublishTitle;
import com.sms.domain.SelectTitle;
import com.sms.domain.Title;
import com.sms.dto.SelectedTitleDTO;
import com.sms.service.*;
import com.sms.vo.TitleVO;
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
@RequestMapping("/selectTitle")
public class SelectTitleController {
    @Autowired
    private SelectTitleService selectTitleService;

    @Autowired
    private TitleService titleService;

    @Autowired
    private TitleVOService titleVOService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private PublishTitleService publishTitleService;

    /**
     * 获取所有老师出的题目
     * @return
     */
    @GetMapping
    public List<TitleVO> listAllTitles() {
        return titleVOService.getTitleVOList();
    }

    //学生选择题目
    @PostMapping("/{titleNo}")
    public boolean selectTitle(HttpServletRequest request, @PathVariable String titleNo) {
        System.out.println(titleNo);
        PublishTitle title = publishTitleService.getById(titleNo);
        if(title.getStatus().equals("1")) return false;
        HttpSession session = request.getSession();
        title.setStatus("1");  // 将题目状态更新为已选（1表示已选）
        SelectTitle selectTitle = new SelectTitle();
        selectTitle.setTeacherNo(title.getTeacherNo());
        selectTitle.setTitleNo(title.getTitleNo());
        String studentNo = studentService.getStudentNo((String) session.getAttribute("user"));
        selectTitle.setStudentNo(studentNo);
        return selectTitleService.save(selectTitle) && publishTitleService.updateById(title);

    }

    /**
     * 根据题目名删除题目 - todo 待完善
     * @param titleName
     * @return
     */
    @DeleteMapping("/{titleName}")
    public boolean deleteSelectTitleById(@PathVariable String titleName){
        String titleNo = titleService.getTitleNoByTitleName(titleName);
        System.out.println(titleNo);
        PublishTitle publishTitle = publishTitleService.getById(titleNo);
        publishTitle.setStatus("0");
        return selectTitleService.removeById(titleNo) && publishTitleService.updateById(publishTitle);
    }

    /**
     * 获取已选题目的信息
     * @param request
     * @return
     */
    @GetMapping("/selected")
    public SelectedTitleDTO showSelectedTitle(HttpServletRequest request){
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
        return studentService.getSelectedTitle(studentService.getStudentNo(user));
    }

}
