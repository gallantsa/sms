package com.sms.service.Impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.TitleVODao;
import com.sms.domain.Title;
import com.sms.service.TitleService;
import com.sms.service.TitleVOService;
import com.sms.vo.TitleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class TitleVOServiceImpl  implements TitleVOService {

    @Autowired
    private TitleVODao titleVODao;

    public List<TitleVO> getTitleVOList(){
        return titleVODao.getTitleVOList();
    }
}
