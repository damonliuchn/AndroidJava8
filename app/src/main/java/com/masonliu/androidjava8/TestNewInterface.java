package com.masonliu.androidjava8;

/**
 * Created by liumeng on 16/6/21.
 */

public class TestNewInterface {
    public static void test() {
        NewInterface.staticMethod();
    }

    interface NewInterface {
        static void staticMethod() {
            System.out.println("i am staticMethod");
        }

        default void testing() {
            System.out.println("i am staticMethon");
        }

        void run();
    }
}
