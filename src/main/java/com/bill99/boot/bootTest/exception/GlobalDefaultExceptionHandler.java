package com.bill99.boot.bootTest.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice //全局控制器
public class GlobalDefaultExceptionHandler {
	
	@ExceptionHandler(value = Exception.class) //用于全局处理控制器里的异常，value可设置过滤条件，此处拦截全部Exception
	public void defaultErrorHandler(HttpServletRequest req, Exception e) {
		e.printStackTrace();
		System.out.println("GlobalDefaultExceptionHandler.defaultErrorHandler()");
	}

	@ModelAttribute //将键值对添加到全局，所有@RequestMapping注解的方法都会获取该键值对
	public void addAttributes(Model model){
		model.addAttribute("msg","额外信息");
	}


}
