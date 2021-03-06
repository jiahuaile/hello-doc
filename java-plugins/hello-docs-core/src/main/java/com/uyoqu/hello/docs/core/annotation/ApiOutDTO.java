package com.uyoqu.hello.docs.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@java.lang.annotation.Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiOutDTO {
    Class clazz() default Object.class;
}
