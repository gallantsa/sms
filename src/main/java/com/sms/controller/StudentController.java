package com.sms.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sms.domain.Student;
import com.sms.domain.User;
import com.sms.service.StudentService;
import com.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private UserService userService;


    /**
     * 根据学号获取学生信息
     * @param studentNo
     * @return
     */
    @GetMapping("/{studentNo}")
    public Student getStudentById(@PathVariable String studentNo) {
        return studentService.getById(studentNo);
    }

    /**
     * 创建一个新学生
     * @param student
     * @return
     */
    @PostMapping
    public boolean saveStudent(@RequestBody Student student) {
        User user = new User();
        user.setUserName(student.getStudentName());
        user.setUserNo(student.getStudentName());
        user.setPassword("123456");
        user.setIdentity("学生");
        return studentService.save(student) && userService.save(user);
    }

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    @PutMapping
    public boolean updateStudent(@RequestBody Student student) {
        return studentService.updateById(student);
    }

    /**
     * 根据学生学号删除学生
     * @param studentNo
     * @return
     */
    @DeleteMapping("/{studentNo}")
    public boolean deleteStudentById(@PathVariable String studentNo) {
        QueryWrapper<Student> qw = new QueryWrapper<>();
        QueryWrapper<User> qw2 = new QueryWrapper<>();
        qw.eq("studentNo", studentNo);
        Student student = studentService.getOne(qw);
        System.out.println(student.getStudentName());
        qw2.eq("userName", student.getStudentName());
        return studentService.removeById(studentNo) && userService.removeById(userService.getOne(qw2).getUserNo());
    }

    /**
     * 列出所有学生信息
     * @return
     */
    @GetMapping
    public List<Student> listAllStudents() {
        return studentService.list();
    }



}
