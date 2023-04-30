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

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Integer id) {
        return teacherService.getById(id);
    }

    @PostMapping("/")
    public boolean saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @PutMapping("/")
    public boolean updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.updateById(teacher);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTeacherById(@PathVariable Integer id) {
        return teacherService.removeById(id);
    }

    @GetMapping("/")
    public List<Teacher> listAllTeachers() {
        return teacherService.list();
    }
}
