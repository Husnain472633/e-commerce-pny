package com.example.ecommerace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class account_select extends AppCompatActivity {
    Button button01 , button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_select);
        button01 = findViewById(R.id.acc_login);
        button02 = findViewById(R.id.acc_sign);
// Login Button working
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account_select.this,login_screen.class);
                startActivity(intent);
                finish();

            }

        });
        // Sign Up  Button working
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(account_select.this, signup_screen.class);
                startActivity(intent);
                finish();
            }
        });


    }
}