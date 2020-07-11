package com.example.remindme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends AppCompatActivity {
    TextView a,b;
    EditText us,pw;
    Button bb;
    int c=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        a=(TextView) findViewById(R.id.fp);
        b=(TextView) findViewById(R.id.nu);
        bb=(Button)findViewById(R.id.lb);
        us=(EditText) findViewById(R.id.uu);
        pw=(EditText)findViewById(R.id.pp);
        bb.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                new Async().execute();

            }

        });

    }
    class Async extends AsyncTask<Void, Void, Void> {


        String records = "", error = "";

        @Override

        protected Void doInBackground(Void... voids) {

            try {

                Class.forName("com.mysql.jdbc.Driver");

                Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.43.173:3306/reminder", "user", "pass");

                Statement statement = connection.createStatement();

                ResultSet resultSet = statement.executeQuery("SELECT * FROM login");

                if (resultSet.execute()==1) {

                    Intent i=new Intent(login.this,home.class);
		    startActivity(i);
                }
		else
		{
		Toast toast = Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT);
                            toast.show();
		}

            } catch (Exception e) {

                

            }

            return null;

        }

        


    }
    }

        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,newuser.class);
                startActivity(i);
            }
        });
        bb=(Button)findViewById(R.id.lb);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Home.class);
                String un = us.getText().toString();
                String ps = pw.getText().toString();
                if(un.equals("yuvank") && ps.equals("pass@123")) {
                    startActivity(i);
                    Toast toast = Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });*/

