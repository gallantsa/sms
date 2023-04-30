package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.StudentDao;
import com.sms.domain.Student;
import com.sms.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}
