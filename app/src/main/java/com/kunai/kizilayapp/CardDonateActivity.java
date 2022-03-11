package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CardDonateActivity extends AppCompatActivity {
    TextView textBloodCard,textDonateCard,textUnitCard,textDateCard,textLocCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_donate);

        initialize();
    }

    private void initialize() {
        textBloodCard = findViewById(R.id.textBloodCard);
        textDonateCard = findViewById(R.id.textDonateCard);
        textUnitCard = findViewById(R.id.textUnitCard);
        textDateCard = findViewById(R.id.textDateCard);
        textLocCard = findViewById(R.id.textLocCard);
    }
}