package com.example.kel.myapplication;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread bg = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    StartActivity(intent);
                    finish();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
    }
}
