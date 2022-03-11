package com.kunai.kizilayapp.forgotpassfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.kunai.kizilayapp.R;


public class ForgotPhoneFragment extends Fragment {
    EditText forgotPhone;
    Button buttonPhoneSend;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_phone, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        forgotPhone = view.findViewById(R.id.forgotPhone);
        buttonPhoneSend = view.findViewById(R.id.buttonPhoneSend);

        buttonPhoneSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PasswordCodeFragment passwordCodeFragment = new PasswordCodeFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameForgot, passwordCodeFragment);
                fragmentTransaction.commit();
            }
        });
    }
}