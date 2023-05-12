package com.sms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.sms.common.Result;
import com.sms.domain.User;
import com.sms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录功能
     * 实现身份认证, 并登录
     * @param request
     * @param user
     * @return
     */
    //发送post请求
    @PostMapping("/login")
    public Result<String> login(HttpServletRequest request, @RequestBody User user){
        //获取密码
        String password = user.getPassword();

        // 根据页面提交的用户账号userNo查询数据库
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();

        lqw.eq(User::getUserNo, user.getUserNo());
        User us = userService.getOne(lqw);
        if(us == null){
            return Result.error("登录失败");
        }

        if(!us.getPassword().equals(password)){
            return Result.error("登录失败");
        }

        request.getSession().setAttribute("user", us.getUserNo());
        // 根据用户身份返回不同的结果
        if (us.getIdentity().equals("管理员")) {
            return Result.success("manager");
        } else if (us.getIdentity().equals("教师")) {
            return Result.success("teacher");
        } else {
            return Result.success("student");
        }
    }
}
