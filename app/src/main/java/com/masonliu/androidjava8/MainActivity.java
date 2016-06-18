package com.masonliu.androidjava8;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

//Lambda表达式
//        函数式接口
//        流API
//        默认方法


//        新的Date
//        Time API


//    Android Gingebread (API 9)及以上:
//        Lambda 表达式
//        java.util.function

//    Android N（API 24）及以上:
//        默认和静态interface方法
//        可重复的注解
//        流(Streams)
//        反射APIs


//interface XX {
//    default void testing(Context context) {
//        Toast.makeText(context, "show java8 demo", Toast.LENGTH_LONG).show();
//    }
//}

//    javac:
//        javac (.java --> .class) --> dx (.class --> .dex)
//    Jack:
//        Jack (.java --> .jack --> .dex)


@FunctionalInterface
interface Runnable {
    public abstract void run();
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        text.setOnClickListener(
                v -> Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_LONG).show()
        );
    }
}
