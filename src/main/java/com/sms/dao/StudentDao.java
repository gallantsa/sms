package com.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.domain.Student;
import com.sms.dto.SelectedTitleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王伟立
 * @version 1.0
 */
@Mapper
public interface StudentDao extends BaseMapper<Student> {

    @Select("select studentNo from student where studentName = #{userNo}")
    String getStudentNo(String userNo);

    @Select("select titleName, teacherName from selecttitle, teacher, title where title.titleNo = selecttitle.titleNo and selecttitle.teacherNo = teacher.teacherNo and studentNo = #{studentNo}")
    SelectedTitleDTO getSelectedTitle(String studentNo);

}
