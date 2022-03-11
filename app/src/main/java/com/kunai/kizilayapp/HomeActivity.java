package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    ImageView donorCardImage,settingsImage,calendarNext,hospitalNext;
    TextView textBloodGroup,textDonateNumber;
    CardView cardMaps,cardAbout,cardContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        initialize();
        donorCardImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,CardDonateActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialize() {
        donorCardImage = findViewById(R.id.donorCardImage);
        settingsImage = findViewById(R.id.settingsImage);
        calendarNext = findViewById(R.id.calendarNext);
        hospitalNext = findViewById(R.id.hospitalNext);
        textBloodGroup = findViewById(R.id.textBloodGroup);
        textDonateNumber = findViewById(R.id.textDonateNumber);
        cardMaps = findViewById(R.id.cardMaps);
        cardAbout = findViewById(R.id.cardAbout);
        cardContact = findViewById(R.id.cardContact);
    }
}