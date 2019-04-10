package com.study.attendance.controller;

import com.study.attendance.bean.Person;
import com.study.attendance.params.LoginParams;
import com.study.attendance.service.LoginService;
import com.study.attendance.vo.OkResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @ApiOperation("登录接口")
    @PostMapping
    public Person login(@RequestBody LoginParams loginParams) {
        return loginService.login(loginParams);
    }
}
