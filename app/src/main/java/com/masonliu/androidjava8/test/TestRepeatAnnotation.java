package com.masonliu.androidjava8.test;

import java.lang.annotation.Repeatable;

/**
 * 允许在同一申明类型（类，属性，或方法）的多次使用同一个注解
 * Created by liumeng02 on 2017/7/13.
 */
@Repeatable(Authorities.class)
@interface Authority {
    String role();
}

@interface Authorities {
    Authority[] value();
}

 class RepeatAnnotationUseOldVersion {

    @Authorities({@Authority(role="Admin"),@Authority(role="Manager")})
    public void doSomeThing(){
    }
}
public class TestRepeatAnnotation {
    @Authority(role="Admin")
    @Authority(role="Manager")
    public void doSomeThing(){ }
}
