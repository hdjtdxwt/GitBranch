package com.epsit.gitbranchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv1).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.tv4).setOnClickListener(this);
        findViewById(R.id.tv5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv1:
                Toast.makeText(this, "测试的tv", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv4:
                fun4();
                break;
            case R.id.tv5:
                fun5();
                break;
            case R.id.btn1:
                fun1();
                break;
            case R.id.btn2:
                fun2();
                break;
        }
    }
    public void fun4(){
        Toast.makeText(this, "功能4", Toast.LENGTH_SHORT).show();
    }
    public void fun5(){
        Toast.makeText(this, "功能5", Toast.LENGTH_SHORT).show();
    }
    public void fun1(){
        Toast.makeText(this, "功能1", Toast.LENGTH_SHORT).show();
    }
    public void fun2(){
        Toast.makeText(this, "功能2", Toast.LENGTH_SHORT).show();
    }
}
