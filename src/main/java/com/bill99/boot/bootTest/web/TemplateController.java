package com.bill99.boot.bootTest.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TemplateController {
	
	@RequestMapping("/template")
	public String template(Map<String, Object> map){
		map.put("hello", "from TemplateController.helloHtml");
		return "/helloworld";
	}
}
