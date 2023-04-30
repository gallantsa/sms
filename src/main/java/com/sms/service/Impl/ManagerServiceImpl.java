package com.sms.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sms.dao.ManagerDao;
import com.sms.domain.Manager;
import com.sms.service.ManagerService;
import org.springframework.stereotype.Service;

/**
 * @author 王伟立
 * @version 1.0
 */
@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, Manager> implements ManagerService {
}
