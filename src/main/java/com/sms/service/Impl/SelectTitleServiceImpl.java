package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.SelectTitleDao;
import com.sms.domain.SelectTitle;
import com.sms.service.SelectTitleService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class SelectTitleServiceImpl extends ServiceImpl<SelectTitleDao, SelectTitle> implements SelectTitleService {
}
