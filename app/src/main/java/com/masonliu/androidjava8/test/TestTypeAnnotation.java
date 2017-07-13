package com.masonliu.androidjava8.test;

import java.util.Collections;

/**
 * 类型注解
 * 类型注解（在 API 级别 23 及更低版本中也可用）
 * 注：类型注解信息仅在编译时可用，而在运行时不可用。
 * 在以前的Java版本中，开发者只能将注解（Annotation）写在声明中。对于Java 8，注解可以写在使用类型的任何地方
 * 类型注解用来支持在Java的程序中做强类型检查，配合第三方插件工具（如Checker Framework），
 * 可以在编译期检测出runtime error（如UnsupportedOperationException、NullPointerException异常），
 * 避免异常延续到运行期才发现，从而提高代码质量，这就是类型注解的主要作用。
 *
 * 先看看下面代码


 Collections.emptyList().add("One");
 int i=Integer.parseInt("hello");
 System.console().readLine();
 上面的代码编译是通过的，但运行是会分别报UnsupportedOperationException； NumberFormatException；NullPointerException异常，这些都是runtime error；

 类型注解被用来支持在Java的程序中做强类型检查。配合插件式的check framework，可以在编译的时候检测出runtime error，以提高代码质量。这就是类型注解的作用了。
 * Created by liumeng on 16/6/21.
 */

public class TestTypeAnnotation {
    public static void test() {
        @TestTypeAnnotationInterface String myString = new  String();
        Collections.emptyList().add("One");
        int i=Integer.parseInt("hello");
        System.console().readLine();
    }
}
