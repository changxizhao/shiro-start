package com.chang.shiro.service.impl;

import com.chang.shiro.mapper.UserMapper;
import com.chang.shiro.model.SysUser;
import com.chang.shiro.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author changxizhao
 * @Date 2020/7/2 13:47
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public SysUser findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);

    }
}
