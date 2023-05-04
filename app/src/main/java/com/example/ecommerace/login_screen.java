package com.example.ecommerace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login_screen extends AppCompatActivity {
    EditText editText01,editText02;
    Button button01,button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        editText01 = findViewById(R.id.email_field_login);
        editText02 = findViewById(R.id.password_field_login);
        button01 = findViewById(R.id.login_button_login);
        button02 = findViewById(R.id.forgot_password_button_login);



        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String email_login =editText01.getText().toString();
                String pass_login = editText02.getText().toString();
                if (email_login.isEmpty()){
                    Toast.makeText(login_screen.this, "Email  Required", Toast.LENGTH_SHORT).show();
                } else if (pass_login.isEmpty()) {
                    Toast.makeText(login_screen.this, "Password  Required", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(login_screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }
        });


    }
}