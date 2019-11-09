package com.example.smartmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    public int type = 1;

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.normal:
                if (checked)
                    type = 1;
                    break;
            case R.id.secret:
                if (checked)
                    type = 2;
                    break;
        }
    }


    protected void onRegister(View v){
        //TODO: Connect to backend

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final Button register_button = findViewById(R.id.createGroupButton);
        register_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onRegister(v);
            }
        });
    }
}
