package com.bill99.boot.bootTest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
	
	@RequestMapping("/fileTest")
	public String fileTest(){
		return "/file";
	}
	
}
