package com.example.a50703.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.* ;
import android.view.* ;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clickbutton(View view){
        switch (view.getId()){
            case R.id.log :
                TextView txt = (TextView)findViewById(R.id.textView3);
                txt.setText("抱歉，登录功能未开放");
                break;
            case R.id.register :
                TextView txt2 = (TextView)findViewById(R.id.textView3);
                txt2.setText("抱歉，注册功能未开放");
                break;
            default:
                break;
        }
    }
}
