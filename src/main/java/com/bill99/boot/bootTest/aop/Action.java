package com.bill99.boot.bootTest.aop;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
/**
 * 编写拦截规则的注解
 */
public @interface Action {
    String name();
}
