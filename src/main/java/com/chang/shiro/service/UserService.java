package com.chang.shiro.service;

import com.chang.shiro.model.SysUser;

/**
 * @Author changxizhao
 * @Date 2020/7/2 13:47
 * @Description
 */
public interface UserService {

    SysUser findUserByUsername(String username);

}
