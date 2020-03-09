package com.bill99.boot.bootTest.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    /**public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoMethodService.add();
        demoAnnotationService.add();
        context.close();
    }**/
}
