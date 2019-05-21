package com.epsit.gitbranchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        if(btn1!=null){
            btn1.setOnClickListener(this);
        }

        if(btn2!=null){
            btn2.setOnClickListener(this);
        }
        if(btn3!=null){
            btn3.setOnClickListener(this);
        }
        if(btn4!=null){
            btn4.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Toast.makeText(this, "btn1点击了", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                fun1();
                break;
            case R.id.btn3:
                fun2();
                break;
            case R.id.btn4:
                fun3();
                break;
        }
    }
    public void fun1(){
        Toast.makeText(this, "fun1()", Toast.LENGTH_SHORT).show();
    }
    public void fun2(){
        Toast.makeText(this, "fun2()", Toast.LENGTH_SHORT).show();
    }
    public void fun3(){
        Toast.makeText(this, "fun3()", Toast.LENGTH_SHORT).show();
    }

}
