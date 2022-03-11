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


public class TCLoginFragment extends Fragment {
    TextView textForgotPass;
    Button loginTcButton;
    EditText loginTc,loginPassTc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t_c_login, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textForgotPass = view.findViewById(R.id.textForgotPass);
        loginTc = view.findViewById(R.id.loginTc);
        loginPassTc = view.findViewById(R.id.loginTcPass);
        loginTcButton = view.findViewById(R.id.loginTcButton);

        textForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}