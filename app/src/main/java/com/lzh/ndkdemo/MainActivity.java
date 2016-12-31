package com.lzh.ndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.lzh.ndkdemo.jni.JniUtil;

//方案也可参考
//http://zke1ev3n.me/2015/12/27/%E4%BD%BF%E7%94%A8AS%E8%BF%9B%E8%A1%8Cndk%E5%BC%80%E5%8F%91/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_calljni).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.tv_show)).setText(new JniUtil().test());
            }
        });
    }
}
