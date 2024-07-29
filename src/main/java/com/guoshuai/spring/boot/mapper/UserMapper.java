package com.guoshuai.spring.boot.mapper;



import com.guoshuai.spring.boot.dao.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Repository
public interface UserMapper {
    int findAll();
}
