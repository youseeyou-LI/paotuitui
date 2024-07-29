package com.guoshuai.spring.boot.Service;
import com.guoshuai.spring.boot.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int findAll() {
        logger.info("Fetching all users from the database");
        return userMapper.findAll();
    }
}
