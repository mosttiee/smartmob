package com.example.smartmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    protected void onLoginBtn(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    protected void onClickRegisterBtn(View v){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_join_and_create);
        setContentView(R.layout.activity_landing);

        final Button button = findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onLoginBtn(v);
            }
        });

        final Button register_button = findViewById(R.id.registerButton);
        register_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onClickRegisterBtn(v);
            }
        });
    }
}
