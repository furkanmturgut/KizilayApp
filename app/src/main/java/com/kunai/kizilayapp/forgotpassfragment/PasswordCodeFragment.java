package com.kunai.kizilayapp.forgotpassfragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kunai.kizilayapp.ForgotPasswordActivity;
import com.kunai.kizilayapp.R;


public class PasswordCodeFragment extends Fragment {
   Button buttonNewPass;
   EditText phoneCode;
   TextView textCount;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_password_code, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonNewPass = view.findViewById(R.id.buttonNewPass);
        phoneCode = view.findViewById(R.id.phoneCode);
        textCount = view.findViewById(R.id.textCount);

         new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long l) {
                textCount.setText("Kalan Süre: "+l/1000+" sn");
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getActivity(), ForgotPasswordActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}