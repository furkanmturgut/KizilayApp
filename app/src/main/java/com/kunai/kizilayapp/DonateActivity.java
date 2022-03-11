package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DonateActivity extends AppCompatActivity {
    TextView textDonateCall;
    EditText editTextName,editTextPhone,editTextCity,editTextCountry,editTextTC,editTextMail,editTextPassword,editTextAddress;
    Button buttonDonate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        initialize();
        buttonDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DonateActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialize() {
        textDonateCall = findViewById(R.id.textDonateCall);
        buttonDonate = findViewById(R.id.buttonDonateOK);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextCity = findViewById(R.id.editTextCity);
        editTextCountry = findViewById(R.id.editTextCountry);
        editTextMail = findViewById(R.id.editTextMail);
        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTC = findViewById(R.id.editTextTC);
        editTextPassword = findViewById(R.id.editTextPassword);
    }
}