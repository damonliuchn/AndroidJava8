package com.masonliu.androidjava8;

import android.util.Log;

/**
 * Created by liumeng on 16/6/21.
 */
public class TestLamda {
    public static void aaa(Runnable2 runnable2) {
        runnable2.run2();
    }

    public static void test() {
        aaa(new Runnable2() {
            @Override
            public void run2() {

            }
        });
        aaa(() -> {
            Log.d("dd", "dd");
        });
    }

    @FunctionalInterface
    interface Runnable2 {
        void run2();
    }
}
