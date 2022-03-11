package com.kunai.kizilayapp.forgotpassfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.kunai.kizilayapp.R;


public class ForgotMailFragment extends Fragment {
    EditText forgotMail;
    Button buttonMailSend;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_mail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        forgotMail = view.findViewById(R.id.forgotMail);
        buttonMailSend = view.findViewById(R.id.buttonMailSend);
    }
}