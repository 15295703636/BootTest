package com.bill99.boot.bootTest.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill99.boot.bootTest.domain.UserInfo;
import com.bill99.boot.bootTest.service.impl.UserServiceImpl;

@RestController
public class UserController {

	@Resource
	private UserServiceImpl userService;
	
	@RequestMapping("/findAll")
	public List<UserInfo> getAllUser(){
		return userService.findAll();
	}
	
	@RequestMapping("/saveUser")
	public void saveUser(){
		UserInfo user = new UserInfo();
		user.setAge(30);
		user.setName("郭雷");
		userService.save(user);
	}

	@RequestMapping(value = "/findUser",params = "name")
	public UserInfo findUser(String name){
		return userService.findUser(name);
	}
	
}
