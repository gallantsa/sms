package com.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sms.domain.Student;
import com.sms.dto.SelectedTitleDTO;

/**
 * @author 王伟立
 * @version 1.0
 */
public interface StudentService extends IService<Student> {
    String getStudentNo(String userNo);

    SelectedTitleDTO getSelectedTitle(String studentNo);
}
