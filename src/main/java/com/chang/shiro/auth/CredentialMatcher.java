package com.chang.shiro.auth;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * @Author changxizhao
 * @Date 2020/7/2 15:20
 * @Description
 */
public class CredentialMatcher extends SimpleCredentialsMatcher {

    // 自定义密码校验规则
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String password = new String(usernamePasswordToken.getPassword());
        String dbPassword = info.getCredentials().toString();
        return this.equals(password,dbPassword);

    }
}
