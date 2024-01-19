package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.realestate.R;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void btnSignUp(View view) {
        Toast.makeText(this, "SignUp Successfully", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(SignUp.this, MainActivity.class);
        startActivity(intent);
    }
}