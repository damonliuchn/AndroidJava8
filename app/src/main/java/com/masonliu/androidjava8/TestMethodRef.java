package com.masonliu.androidjava8;

/**
 * 方法引用 就是为某一个方法设置别名
 * 引用静态方法
 * 引用对象方法
 * 引用特定类型方法
 * 引用构造方法
 * <p>
 * 方法引用也可以看做lamda表达式的简化
 * Created by liumeng on 16/6/23.
 */

public class TestMethodRef {
    public static void test() {
        //引用静态方法
        IMessage<Double, String> msg0 = d -> String.valueOf(d);
        IMessage<Double, String> msg1 = String::valueOf;
        System.out.println(msg1.convert(111.33));
        //引用对象方法
        IMessage2<String> msg2 = () -> "hello".toUpperCase();
        IMessage2<String> msg3 = "hello"::toUpperCase;
        //引用特定类型方法
        IMessage3<String, Integer> msg4 = (s1, s2) -> s1.compareTo(s2);
        IMessage3<String, Integer> msg5 = String::compareTo;
        //引用构造方法
        IMessage4<String, Integer, Person> msg6 = (s1, i1) -> new Person(s1, i1);
        IMessage4<String, Integer, Person> msg7 = Person::new;
    }

    @FunctionalInterface
    interface IMessage<P, R> {
        R convert(P p);
    }

    @FunctionalInterface
    interface IMessage2<R> {
        R upper();
    }

    @FunctionalInterface
    interface IMessage3<P, R> {
        R compare(P p1, P p2);
    }

    @FunctionalInterface
    interface IMessage4<P, P2, R> {
        R create(P p1, P2 p2);
    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

