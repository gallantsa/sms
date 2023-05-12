package com.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sms.vo.TitleVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
public interface TitleVOService{

    List<TitleVO> getTitleVOList();
}
