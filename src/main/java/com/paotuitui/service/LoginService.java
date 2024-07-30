package com.paotuitui.service;

import com.paotuitui.domain.StudentExample;
import com.paotuitui.mapper.StudentMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LoginService {
    @Resource
    private StudentMapper studentMapper;
    public String loginStudentToPassword(Long studentId){
        StudentExample example = new StudentExample();
        example.createCriteria().andStudentIdEqualTo(studentId);
        return studentMapper.selectOneByExample(example).getPassword();
    }
}
