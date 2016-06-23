package com.masonliu.androidjava8;

/**
 * lamda表达式 以简化面向对象结构 为主。
 * Created by liumeng on 16/6/21.
 */
public class TestLamda {
    public static void setRunnable(Runnable runnable) {
        runnable.run();
    }

    public static void test() {
        setRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("i am not lamda");
            }
        });
        setRunnable(() -> System.out.println("i am lamda"));
        IMath iMath = (i, j) -> {
            int result = i + j;
            return result;
        };
        IMath iMath2 = (i, j) -> i + j;
    }

    @FunctionalInterface
    interface Runnable {
        void run();
    }

    @FunctionalInterface
    interface IMath {
        int add(int i, int j);
    }
}
