package com.chang.shiro.mapper;

import com.chang.shiro.model.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @Author changxizhao
 * @Date 2020/7/2 13:45
 * @Description
 */
public interface UserMapper {

    SysUser findUserByUsername(@Param("username") String username);
}
