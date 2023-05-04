package com.example.ecommerace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class signup_screen extends AppCompatActivity {
    EditText editText01,editText02,editText03,editText04,editText05;
    Button button01,button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_screen);

        editText01 = findViewById(R.id.user_name_signup);
        editText02 = findViewById(R.id.email_edittext);
        editText03 = findViewById(R.id.password_edittext);
        editText04 = findViewById(R.id.editTextTextPostalAddress);
        editText05 = findViewById(R.id.fullname_signup);

        button01 =findViewById(R.id.signup_button);
        button02 =findViewById(R.id.login_textview);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = editText01.getText().toString();
                String email_ = editText02.getText().toString();
                String pass_  = editText03.getText().toString();
                String addres = editText04.getText().toString();
                String full_name = editText05.getText().toString();

                if (user.isEmpty()){
                    Toast.makeText(signup_screen.this, "User Name Required", Toast.LENGTH_SHORT).show();
                } else if (email_.isEmpty()) {
                    Toast.makeText(signup_screen.this, "Email Required", Toast.LENGTH_SHORT).show();

                } else if (pass_.isEmpty()) {
                    Toast.makeText(signup_screen.this, "PassWord Required", Toast.LENGTH_SHORT).show();

                } else if (addres.isEmpty()) {
                    Toast.makeText(signup_screen.this, "Full Address  Required", Toast.LENGTH_SHORT).show();

                } else if (full_name.isEmpty()) {
                    Toast.makeText(signup_screen.this, "Full Name Required", Toast.LENGTH_SHORT).show();

                }else {
                    Intent intent = new Intent(signup_screen.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup_screen.this, login_screen.class);
                startActivity(intent);
                finish();
            }
        });

    }
}