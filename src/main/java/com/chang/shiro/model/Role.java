package com.chang.shiro.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author changxizhao
 * @Date 2020/7/2 13:33
 * @Description
 */
public class Role {
    private Integer rid;

    private String rname;

    private Set<Permission> permissions = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
