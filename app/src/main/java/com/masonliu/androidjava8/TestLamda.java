package com.masonliu.androidjava8;

/**
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
        setRunnable(() -> {
            System.out.println("i am lamda");
        });
    }

    @FunctionalInterface
    interface Runnable {
        void run();
    }
}
