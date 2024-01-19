package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.realestate.R;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void btnBackToLogin(View view) {
        Intent intent = new Intent(ForgotPassword.this, Login.class);
        startActivity(intent);
    }

    public void btnSendForgotPassword(View view) {
        Toast.makeText(this, "Forgot Password Successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ForgotPassword.this, Login.class);
        startActivity(intent);
    }
}