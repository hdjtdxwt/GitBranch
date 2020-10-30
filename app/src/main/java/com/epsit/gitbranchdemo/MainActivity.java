package com.epsit.gitbranchdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this, "测试", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2: {
                Toast.makeText(this, "测试", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, TestActivity.class));
            }break;
            case R.id.btn3: {
                Toast.makeText(this, "测试3", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Test3Activity.class));
            }break;
            case R.id.btn5: {
                Toast.makeText(this, "测试5", Toast.LENGTH_SHORT).show();
            }break;
        }
    }
}
