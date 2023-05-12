package com.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.vo.TitleVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@Mapper
public interface TitleVODao extends BaseMapper<TitleVO> {
    @Select("Select publishtitle.titleNo, titleName, teacherName from publishtitle, teacher, title where publishtitle.teacherNo = teacher.teacherNo and publishtitle.titleNo = title.titleNo and status != '1' ")
    List<TitleVO> getTitleVOList();
}
