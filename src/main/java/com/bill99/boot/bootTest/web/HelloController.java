package com.bill99.boot.bootTest.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill99.boot.bootTest.domain.UserInfo;

@RestController
public class HelloController {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @PreAuthorize("hasAnyAuthority('User')")
	@RequestMapping("/user")
	public UserInfo getUser(){
		UserInfo u = new UserInfo();
		u.setName("郭雷");u.setAge(30);
		return u;
	}
	
	@RequestMapping("/zeroException")
	public int zeroException(){
		return 100/0;
	}
}
