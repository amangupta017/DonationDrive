package com.example.donationdrive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnJoinNow;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoinNow = findViewById(R.id.btn1);


        btnJoinNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a =new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(a);
            }
        });
    }
}