package com.bill99.boot.bootTest.service;

import java.util.List;

import com.bill99.boot.bootTest.domain.UserInfo;

public interface UserService {
	
	public void save(UserInfo user);
	
	public List<UserInfo> findAll();
}
