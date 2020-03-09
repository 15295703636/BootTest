package com.bill99.boot.bootTest.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 角色表
 *
 */
@Entity(name = "role")
public class Role {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_name_desc")
    private String roleNameDesc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNameDesc() {
        return roleNameDesc;
    }

    public void setRoleNameDesc(String roleNameDesc) {
        this.roleNameDesc = roleNameDesc;
    }
}
