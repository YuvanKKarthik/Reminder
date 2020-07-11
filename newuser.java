package com.example.remindme;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class newuser extends AppCompatActivity {
    public EditText a,b;
    public Button r;
    String aa,bb;
    Boolean ii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);
        a=(EditText) findViewById(R.id.pass);
        b=(EditText)findViewById(R.id.cpass);
        r=(Button)findViewById(R.id.reg);
        aa=a.getText().toString();
        bb=b.getText().toString();
        r.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                            Intent i = new Intent(newuser.this, Login.class);
                            Toast toast = Toast.makeText(getApplicationContext(), "Registration Successfull", Toast.LENGTH_SHORT);
                            toast.show();
                            startActivity(i);
                        }



            });
         }
    }




