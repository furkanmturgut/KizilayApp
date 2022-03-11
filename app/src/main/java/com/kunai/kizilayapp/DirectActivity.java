package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DirectActivity extends AppCompatActivity {
    TextView textViewCall;
    Button buttonLogin, buttonDonate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct);

        buttonDonate = findViewById(R.id.buttonDonate);
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewCall = findViewById(R.id.textViewCall);

        buttonDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DirectActivity.this,DonateActivity.class);
                startActivity(intent);
            }
        });


    }
}