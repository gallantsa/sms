package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.TitleDao;
import com.sms.domain.Title;
import com.sms.service.TitleService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class TitleServiceImpl extends ServiceImpl<TitleDao, Title> implements TitleService {
}
