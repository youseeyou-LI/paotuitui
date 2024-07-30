package com.paotuitui.controller;

import com.paotuitui.JwtUtils.JwtUtil;
import com.paotuitui.mapper.StudentMapper;
import com.paotuitui.response.LoginResponse;
import com.paotuitui.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
@Component
public class Login {
    private static final Logger log = LoggerFactory.getLogger(Login.class);
    @Resource
    private  LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestParam("studentId") Long studentId, @RequestParam("password") String password) {
        // 这里仅作为示例，实际应用中应该对用户名和密码进行验证
        String s = loginService.loginStudentToPassword(studentId);
        LoginResponse loginResponse;
        if(s == null || "".equals(s)){
            loginResponse = new LoginResponse()
                    .builder()
                    .msg("用户登陆错误")
                    .build();

        }else {
            loginResponse = new LoginResponse()
                    .builder()
                    .token(JwtUtil.generateToken(studentId))
                    .msg("登陆成功")
                    .build();
        }
        return ResponseEntity.ok(loginResponse);


    }

}
