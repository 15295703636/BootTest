package com.bill99.boot.bootTest.service.impl;

import com.bill99.boot.bootTest.domain.Role;
import com.bill99.boot.bootTest.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserDetailImpl implements UserDetails{
    private String username;
    private String password;
    //包含着用户对应的所有Role，在使用时调用者给对象注入roles
    private List<Role> roles;

    @Autowired
    private RoleService roleService;

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    //无参构造
    public UserDetailImpl() {
    }

    //用User构造
    public UserDetailImpl(Users user) {
        this.username = user.getUserName();
        this.password = user.getPwd();
    }

    //用User和List<Role>构造
    public UserDetailImpl(Users user, List<Role> roles) {
        this.username = user.getUserName();
        this.password = user.getPwd();
        this.roles = roles;
    }

    public List<Role> getRoles()
    {
        return roles;
    }

    @Override
    //返回用户所有角色的封装，一个Role对应一个GrantedAuthority
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for(Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    //判断账号是否已经过期，默认没有过期
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    //判断账号是否被锁定，默认没有锁定
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    //判断信用凭证是否过期，默认没有过期
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    //判断账号是否可用，默认可用
    public boolean isEnabled() {
        return true;
    }

}
