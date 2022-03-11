package com.kunai.kizilayapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.kunai.kizilayapp.forgotpassfragment.ForgotMailFragment;
import com.kunai.kizilayapp.forgotpassfragment.ForgotPhoneFragment;

public class ForgotPasswordActivity extends AppCompatActivity {
    Button forgotButtonMail,forgotButtonPhone;
    FrameLayout frameForgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        forgotButtonMail = findViewById(R.id.forgotButtonMail);
        forgotButtonPhone = findViewById(R.id.forgotButtonPhone);
        frameForgot = findViewById(R.id.frameForgot);

        forgotButtonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                forgotButtonMail.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                forgotButtonPhone.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                fragmentForgot(new ForgotMailFragment());
            }
        });

        forgotButtonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                forgotButtonMail.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                forgotButtonPhone.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.white));
                fragmentForgot(new ForgotPhoneFragment());
            }
        });

    }

    private void fragmentForgot(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameForgot,fragment);
        fragmentTransaction.commit();
    }
}