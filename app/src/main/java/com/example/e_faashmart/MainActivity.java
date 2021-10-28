package com.example.e_faashmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login, signUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        login = findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this , signIn_Acttivity.class);
                startActivity(intent);


            }



        });

        signUp=findViewById(R.id.btnsignup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Redirecting to Signup page", Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(MainActivity.this, Signup_Activity.class);
                startActivity(intent);


            }
        }
        );



    }
}