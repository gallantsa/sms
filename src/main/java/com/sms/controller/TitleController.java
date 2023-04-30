package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.domain.Title;
import com.sms.service.TitleService;
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

    // 学生选择题目
    @PostMapping("/select")
    public boolean selectTitle(@RequestBody Title title) {
        // 根据题目编号和老师编号查询题目，更新为已选状态
        QueryWrapper<Title> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("titleNo", title.getTitleNo())
                .eq("teacherNo", title.getTeacherNo());
        Title updateTitle = new Title();
        //updateTitle.setStatus(1);  // 将题目状态更新为已选（1表示已选）
        return titleService.update(updateTitle, queryWrapper);
    }

    // 老师发布题目
    @PostMapping("/publish")
    public boolean publishTitle(@RequestBody Title title) {
        return titleService.save(title);
    }

    // 老师修改题目
    @PutMapping("/update")
    public boolean updateTitle(@RequestBody Title title) {
        return titleService.updateById(title);
    }

    // 老师删除题目
    @DeleteMapping("/{titleNo}/{teacherNo}")
    public boolean deleteTitle(@PathVariable("titleNo") String titleNo, @PathVariable("teacherNo") String teacherNo) {
        QueryWrapper<Title> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("titleNo", titleNo)
                .eq("teacherNo", teacherNo);
        return titleService.remove(queryWrapper);
    }

    // 获取所有题目
    @GetMapping("/")
    public List<Title> listAllTitles() {
        return titleService.list();
    }
}
