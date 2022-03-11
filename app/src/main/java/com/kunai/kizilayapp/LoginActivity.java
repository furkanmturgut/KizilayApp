package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.kunai.kizilayapp.loginfragments.MailLoginFragment;
import com.kunai.kizilayapp.loginfragments.PhoneLoginFragment;
import com.kunai.kizilayapp.loginfragments.TCLoginFragment;

public class LoginActivity extends AppCompatActivity {
    Button buttonTC,buttonMail,buttonPhone;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        frameLayout = findViewById(R.id.frameLayout);
        buttonMail = findViewById(R.id.buttonMail);
        buttonPhone = findViewById(R.id.buttonPhone);
        buttonTC = findViewById(R.id.buttonTC);

        buttonTC.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                tcCLicked();
                fragmentAdd(new TCLoginFragment());
            }
        });

        buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mailClicked();
                fragmentAdd(new MailLoginFragment());
            }
        });

        buttonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneClicked();
                fragmentAdd(new PhoneLoginFragment());
            }
        });
    }


    private void tcCLicked(){
        buttonTC.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        buttonMail.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
        buttonPhone.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
    }

    private void mailClicked(){
        buttonTC.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
        buttonMail.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
        buttonPhone.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
    }

    private void phoneClicked(){
        buttonTC.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
        buttonMail.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
        buttonPhone.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
    }

    private void fragmentAdd(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}