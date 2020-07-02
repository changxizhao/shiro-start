package com.chang.shiro.model;

/**
 * @Author changxizhao
 * @Date 2020/7/2 13:32
 * @Description
 */
public class Permission {
    private Integer pid;

    private String pname;

    private String url;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
