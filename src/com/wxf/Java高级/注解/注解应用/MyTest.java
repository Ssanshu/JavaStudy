package com.wxf.Java高级.注解.注解应用;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
    String value();
    double aaa() default 100.0;
    String[] bbb();
}
