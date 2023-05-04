package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.domain.Teacher;
import com.sms.domain.User;
import com.sms.service.TeacherService;
import com.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @Autowired
    private UserService userService;

    /**
     * 根据教师编号查找教师
     * @param teacherNo
     * @return
     */
    @GetMapping("/{teacherNo}")
    public Teacher getTeacherById(@PathVariable String teacherNo) {
        return teacherService.getById(teacherNo);
    }

    /**
     * 增加教师
     * @param teacher
     * @return
     */
    @PostMapping
    public boolean saveTeacher(@RequestBody Teacher teacher) {
        User user = new User();
        user.setUserName(teacher.getTeacherName());
        user.setUserNo(teacher.getTeacherName());
        user.setPassword("123456");
        user.setIdentity("教师");
        return teacherService.save(teacher) && userService.save(user);
    }

    /**
     * 更新老师信息
     * @param teacher
     * @return
     */
    @PutMapping
    public boolean updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveOrUpdate(teacher);
    }

    /**
     * 根据教师编号删除教师
     * @param teacherNo
     * @return
     */
    @DeleteMapping("/{teacherNo}")
    public boolean deleteTeacherById(@PathVariable String teacherNo) {
        QueryWrapper<Teacher> qw = new QueryWrapper<>();
        QueryWrapper<User> qw2 = new QueryWrapper<>();
        qw.eq("teacherNo", teacherNo);
        Teacher teacher = teacherService.getOne(qw);
        qw2.eq("userName", teacher.getTeacherName());

        return teacherService.removeById(teacherNo) && userService.removeById(userService.getOne(qw2).getUserNo());
    }

    /**
     * 列出所有教师信息
     * @return
     */
    @GetMapping
    public List<Teacher> listAllTeachers() {
        return teacherService.list();
    }
}
