package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.TeacherDao;
import com.sms.domain.Teacher;
import com.sms.service.TeacherService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {
}
