package com.bill99.boot.bootTest.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bill99.boot.bootTest.dao.UserInfoRepository;
import com.bill99.boot.bootTest.domain.UserInfo;
import com.bill99.boot.bootTest.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
    UserInfoRepository userDao;

	@Transactional
	public void save(UserInfo user){
		userDao.save(user);
	}
	
	public List<UserInfo> findAll(){
		return (List<UserInfo>) userDao.findAll();
	}

	public UserInfo findUser(String name){
		return userDao.getUserByName(name);
	}
}
