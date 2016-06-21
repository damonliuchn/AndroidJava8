package com.masonliu.androidjava8;

import android.util.Log;

/**
 * Created by liumeng on 16/6/21.
 */

public class TestNewInterface {
    interface XX {
        static void aaa() {
            Log.d("dd", "dddswdsfwef");
        }

        default void testing() {
            Log.d("dd", "dddddd");
        }

        void run3();
    }
}
