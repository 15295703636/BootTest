package com.bill99.boot.bootTest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvironmentConfig implements EnvironmentAware{

	@Value("${spring.datasource.url}")
	private String myUrl;
	
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		//打印注入的属性信息.
		System.out.println("myUrl="+myUrl);
		//通过environment 获取到系统属性.
		System.out.println(environment.getProperty("JAVA_HOME"));
		//通过environment 同样能获取到application.properties配置的属性.
		System.out.println(environment.getProperty("spring.datasource.url"));
		//获取到前缀是"spring.datasource." 的属性列表值.
		RelaxedPropertyResolver relaxedPropertyResolver = new RelaxedPropertyResolver(environment,"spring.datasource.");
		System.out.println("spring.datasource.url="+relaxedPropertyResolver.getProperty("url"));
		System.out.println("spring.datasource.driverClassName="+relaxedPropertyResolver.getProperty("driverClassName"));
	}

}
