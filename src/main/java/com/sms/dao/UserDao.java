package com.sms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sms.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 王伟立
 * @version 1.0
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
