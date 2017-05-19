package com.masonliu.androidjava8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by liumeng02 on 2017/5/19.
 */

@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public  @interface MyTypeAnnotation {

}
