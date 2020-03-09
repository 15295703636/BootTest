package com.bill99.boot.bootTest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户表
 */
@Entity(name = "users")
public class Users {
    @Id
    private String userName;
    private String pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
