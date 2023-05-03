package com.sms.controller;

import com.sms.domain.Teacher;
import com.sms.service.TeacherService;
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
        return teacherService.save(teacher);
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
     * 删除教师
     * @param teacherNo
     * @return
     */
    @DeleteMapping("/{teacherNo}")
    public boolean deleteTeacherById(@PathVariable String teacherNo) {
        return teacherService.removeById(teacherNo);
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
