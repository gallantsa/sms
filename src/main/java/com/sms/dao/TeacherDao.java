package com.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王伟立
 * @version 1.0
 */
@Mapper
public interface TeacherDao extends BaseMapper<Teacher> {

    @Select("Select teacherNo from teacher where teacherName = #{userNo}")
    String getTeacherNo(String userNo);
}
