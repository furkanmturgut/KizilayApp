package com.kunai.kizilayapp.loginfragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kunai.kizilayapp.ForgotPasswordActivity;
import com.kunai.kizilayapp.HomeActivity;
import com.kunai.kizilayapp.R;

public class MailLoginFragment extends Fragment {
    TextView textForgotPassMail;
    EditText loginMail,loginMailPass;
    Button loginMailButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mail_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textForgotPassMail = view.findViewById(R.id.textForgotPassMail);
        loginMail = view.findViewById(R.id.loginMail);
        loginMailPass = view.findViewById(R.id.loginMailPass);
        loginMailButton = view.findViewById(R.id.loginMailButton);

        textForgotPassMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        loginButtonClicked();

    }

    private void loginButtonClicked() {
        Intent intent = new Intent(getActivity(), HomeActivity.class);
        startActivity(intent);
    }
}