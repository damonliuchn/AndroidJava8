package com.masonliu.androidjava8;

import android.support.annotation.NonNull;

/**
 * 类型注解
 * 类型注解（在 API 级别 23 及更低版本中也可用）
 * 注：类型注解信息仅在编译时可用，而在运行时不可用。
 * 在以前的Java版本中，开发者只能将注解（Annotation）写在声明中。对于Java 8，注解可以写在使用类型的任何地方
 * Created by liumeng on 16/6/21.
 */

public class TestTypeAnnotation {
    public static void test() {
        @MyTypeAnnotation String myString = new  String();
    }
}
