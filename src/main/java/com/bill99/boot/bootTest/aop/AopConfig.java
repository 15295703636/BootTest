package com.bill99.boot.bootTest.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.bill99.boot.bootTest.aop")
@EnableAspectJAutoProxy //使用@EnableAspectJAutoProxy开启spring对AspectJ代理的支持
public class AopConfig {
}
