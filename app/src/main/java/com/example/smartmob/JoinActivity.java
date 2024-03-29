package com.example.smartmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {

    public void onJoinBtn(View v){
        Intent intent = new Intent(this, JoinGroupActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        final Button button = findViewById(R.id.joinNewGroupButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onJoinBtn(v);
            }
        });
    }
}
