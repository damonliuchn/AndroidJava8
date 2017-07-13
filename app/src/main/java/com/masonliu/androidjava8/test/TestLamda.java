package com.masonliu.androidjava8.test;

import android.util.Log;

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
                Log.d("TestLamda","i am not lamda");
            }
        });
        setRunnable(() -> Log.d("TestLamda","i am lamda"));
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
