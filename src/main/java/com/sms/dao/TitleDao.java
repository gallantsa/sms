package com.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.domain.Title;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@Mapper
public interface TitleDao extends BaseMapper<Title> {

    @Select("select titleNo from title where titleName = #{titleName}")
    String getTitleNoByTitleName(String titleName);

    @Select("SELECT title.titleNo, title.titleName\n" +
            "FROM title\n" +
            "LEFT JOIN (\n" +
            "  SELECT titleNo\n" +
            "  FROM publishtitle\n" +
            "  WHERE teacherNo = #{teacherNo}\n" +
            ") AS published ON title.titleNo = published.titleNo\n" +
            "WHERE published.titleNo IS NULL")
    List<Title> getAllPublishTitle(String teacherNo);

    @Select("select title.titleNo, titleName from title, publishtitle where title.titleNo = publishtitle.titleNo and teacherNo = #{teacherNo}")
    List<Title> getAllPublishedTitle(String teacherNo);


}
