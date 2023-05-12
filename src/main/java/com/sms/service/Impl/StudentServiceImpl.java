package com.sms.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.StudentDao;
import com.sms.domain.Student;
import com.sms.dto.SelectedTitleDTO;
import com.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public String getStudentNo(String userNo){
        return studentDao.getStudentNo(userNo);
    }

    public SelectedTitleDTO getSelectedTitle(String studentNo){
        return studentDao.getSelectedTitle(studentNo);
    }
}
