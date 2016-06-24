package com.masonliu.androidjava8;

/**
 * Created by liumeng on 16/6/21.
 */

public class TestNewInterface {
    public static void test() {
        NewInterface.staticMethod();
        //功能型
        Function<String, Boolean> function = "**"::startsWith;
        System.out.println(function.apply("##"));
        //消费型
        Consumer<String> consumer = System.out::println;
        consumer.accept("ddddd");
        //供给型
        Supplier<String> supplier = "ddd"::toUpperCase;
        System.out.println(supplier.get());
        //断言型
        Predicate<Object> predicate = "hello"::equals;
        System.out.println(predicate.test("dddd"));
    }

    interface NewInterface {
        static void staticMethod() {
            System.out.println("i am staticMethod");
        }

        default void testing() {
            System.out.println("i am testing");
        }

        default void testing2() {
            System.out.println("i am testing2");
        }

        void run();
    }

    //内建函数式接口 - 4类函数式接口
    //1功能型接口
    @FunctionalInterface
    interface Function<T, R> {
        R apply(T t);
    }

    //2供给型接口
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    //3断言型接口 做判断使用
    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    //4消费型接口
    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

    class A implements NewInterface {
        public void testing() {
            //super.testing(); 这样不行
            NewInterface.super.testing();
            System.out.println("i am staticMethon");
        }

        @Override
        public void run() {

        }
    }
}
