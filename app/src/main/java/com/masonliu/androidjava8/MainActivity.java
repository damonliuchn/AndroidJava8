package com.masonliu.androidjava8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

//        Lambda 表达式 、函数式接口（在 API 级别 23 及更低版本中也可用）
//        方法引用（在 API 级别 23 及更低版本中也可用）
//        类型注解（在 API 级别 23 及更低版本中也可用）
//        重复注解
//        默认和静态接口方法
//        流(Streams)

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = (TextView) findViewById(R.id.text);
        //text.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_LONG).show());
    }
}
