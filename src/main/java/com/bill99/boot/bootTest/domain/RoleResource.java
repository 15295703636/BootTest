package com.bill99.boot.bootTest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 角色-权限表
 */
@Entity(name = "role_resource")
public class RoleResource {
    @Id @GeneratedValue
    private int id;
    private int rid;
    private int resid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }
}
