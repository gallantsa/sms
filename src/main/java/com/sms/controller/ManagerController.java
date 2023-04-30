package com.sms.controller;

import com.sms.common.Result;
import com.sms.domain.User;
import com.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 王伟立
 * @version 1.0
 */
@RestController
@RequestMapping("/Manager")
public class ManagerController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result<String> save(HttpServletRequest request, @RequestBody User user){
        //设置默认密码为123456
        user.setPassword("12345");
        //存入数据库
        userService.save(user);
        return Result.success("添加用户成功");
    }

}
