package com.bill99.boot.bootTest.aop;

import org.springframework.stereotype.Service;

/**
 * 编写使用注解的被拦截类
 */

@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截add操作")
    public void add(){

    };

}
