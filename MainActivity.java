package com.example.remindme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
private ProgressBar ps;
private int status=0;
private Handler m=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ps=(ProgressBar)findViewById(R.id.pb);
        final Intent i =new Intent(this,Login.class);
        new Thread(new Runnable() {
            @Override
            public void run() {

                while(status<100)
                {
                    status++;
                    android.os.SystemClock.sleep(10);
                    m.post(new Runnable() {
                        @Override
                        public void run() {
                            ps.setProgress(status);
                        }
                    });
                    if(status==99)
                        startActivity(i);
                }
            }
        }).start();
    }
}
