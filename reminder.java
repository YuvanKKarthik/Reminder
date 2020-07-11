package com.example.remindme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class reminder extends AppCompatActivity {
    Button srem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        srem=(Button)findViewById(R.id.setrem);
        srem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(reminder.this,Home.class);
                startActivity(i);
                Toast toast=Toast. makeText(getApplicationContext(),"Task added successfully",Toast. LENGTH_SHORT);
                toast. show();
            }
        });
    }
}
