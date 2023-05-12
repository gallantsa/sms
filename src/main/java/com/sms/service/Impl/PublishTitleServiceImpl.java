package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.PublishTitleDao;
import com.sms.domain.PublishTitle;
import com.sms.service.PublishTitleService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class PublishTitleServiceImpl extends ServiceImpl<PublishTitleDao, PublishTitle> implements PublishTitleService {
}
