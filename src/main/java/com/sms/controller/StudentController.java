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

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getById(id);
    }

    @PostMapping("/")
    public boolean saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/")
    public boolean updateStudent(@RequestBody Student student) {
        return studentService.updateById(student);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable Integer id) {
        return studentService.removeById(id);
    }

    @GetMapping("/")
    public List<Student> listAllStudents() {
        return studentService.list();
    }

}
