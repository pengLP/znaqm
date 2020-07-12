package com.gld.znaqm.service.impl;

import com.gld.znaqm.mapper.UserMapper;
import com.gld.znaqm.model.User;
import com.gld.znaqm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }


}
