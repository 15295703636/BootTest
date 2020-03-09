package com.bill99.boot.bootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.context.annotation.Bean;
//
//import com.bill99.boot.bootTest.servlet.MyServlet;

@SpringBootApplication //由@Configuration @ComponentScan @EnableAutoConfiguration组成

@ServletComponentScan
public class BootTestApplication {

//	@Bean
//	public ServletRegistrationBean getMyServlet(){
//		return new ServletRegistrationBean(new MyServlet(),"/myServlet/*");
//	}
	public static void main(String[] args) {
		SpringApplication.run(BootTestApplication.class, args);
	}
}
