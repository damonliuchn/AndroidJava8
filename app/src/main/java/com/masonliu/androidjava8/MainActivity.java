package com.masonliu.androidjava8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

//    Android Gingebread (API 9)及以上:
//        Lambda 表达式
//        java.util.function 函数式接口
//    Android N（API 24）及以上:
//        默认和静态interface方法
//        可重复的注解
//        流(Streams)
//        Java 8 对 IO/NIO 也做了一些改进
//        支持新的 Unicode 6.2.0 标准，新增了日历和本地化的 API，改进了日期时间的管理等


//    javac:
//        javac (.java --> .class) --> dx (.class --> .dex)
//    Jack:
//        Jack (.java --> .jack --> .dex)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        text.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_LONG).show());
    }
}
