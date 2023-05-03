package com.sms.controller;


import com.sms.domain.Student;
import com.sms.service.StudentService;
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
        return studentService.save(student);
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
        return studentService.removeById(studentNo);
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
