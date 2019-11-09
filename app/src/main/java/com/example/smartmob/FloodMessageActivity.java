package com.example.smartmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FloodMessageActivity extends AppCompatActivity {

    public void onSubmitBtn(View v){
        Intent intent = new Intent(this, FloodMessageActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_message);

        final Button button = findViewById(R.id.submitButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onSubmitBtn(v);
            }
        });
    }
}
