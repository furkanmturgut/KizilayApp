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
import com.kunai.kizilayapp.R;

import org.w3c.dom.Text;


public class PhoneLoginFragment extends Fragment {
    TextView textForgotPhoneLogin;
    Button loginPhoneButton;
    EditText loginPhone,loginPhonePass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phone_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textForgotPhoneLogin = view.findViewById(R.id.textForgotPassPhone);
        loginPhone = view.findViewById(R.id.loginPhone);
        loginPhonePass = view.findViewById(R.id.loginPhonePass);
        loginPhoneButton = view.findViewById(R.id.loginPhoneButton);

        textForgotPhoneLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

    }
}