package com.example.remindme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;


public class location extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toast toast = Toast.makeText(getApplicationContext(), "Ur OUTSIDE the college", Toast.LENGTH_SHORT);
        toast.show();


    }
}
