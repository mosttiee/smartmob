package com.example.smartmob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class FloodMessageActivity extends AppCompatActivity {

    public String type = "";

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.normal:
                if (checked)
                    type = "normal";
                break;
            case R.id.secret:
                if (checked)
                    type = "secret";
                break;
            case R.id.emergency:
                if (checked)
                    type = "emergency";
                break;
        }
    }

    public void onSubmitBtn(View v){
        //to check the type of msg
        onRadioButtonClicked(v) ;

        //do the flooding msg function

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
