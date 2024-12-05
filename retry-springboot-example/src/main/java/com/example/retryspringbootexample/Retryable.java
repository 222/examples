package com.example.retryspringbootexample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author youping.tan
 * @date 2024/12/4 14:51
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Retryable {

    int retries() default 3; //默认重试次数

    String fallback() default ""; //失败回调方法的名称

    int millis() default 30000;
}
