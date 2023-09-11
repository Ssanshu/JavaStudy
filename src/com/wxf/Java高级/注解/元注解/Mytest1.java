package com.wxf.Java高级.注解.元注解;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author Ssanshu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Mytest1 {

}
