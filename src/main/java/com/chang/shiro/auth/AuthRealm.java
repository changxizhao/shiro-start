package com.chang.shiro.auth;

import com.chang.shiro.model.Permission;
import com.chang.shiro.model.Role;
import com.chang.shiro.model.SysUser;
import com.chang.shiro.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author changxizhao
 * @Date 2020/7/2 15:07
 * @Description
 */
public class AuthRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SysUser sysUser = (SysUser) principalCollection.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList = new ArrayList<>();
        List<String> roleNameList = new ArrayList<>();
        Set<Role> roles = sysUser.getRoles();
        if(CollectionUtils.isNotEmpty(roles)) {
            for (Role role : roles) {
                roleNameList.add(role.getRname());
                Set<Permission> permissions = role.getPermissions();
                if(CollectionUtils.isNotEmpty(permissions)) {
                    for (Permission permission : permissions) {
                        permissionList.add(permission.getPname());
                    }
                }
            }
        }
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(permissionList);
        authorizationInfo.addRoles(roleNameList);
        return authorizationInfo;
    }

    // 登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        SysUser sysUser = userService.findUserByUsername(username);
        System.out.println(sysUser.toString());
        return new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),this.getClass().getName());
    }
}
