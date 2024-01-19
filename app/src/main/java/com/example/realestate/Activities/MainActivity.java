package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.realestate.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRent(View view) {
        Intent intent = new Intent(MainActivity.this, Rent.class);
        startActivity(intent);
    }

    public void btnBuy(View view) {
        Intent intent = new Intent(MainActivity.this, Buy.class);
        startActivity(intent);
    }

    public void btnProjects(View view) {
        Intent intent = new Intent(MainActivity.this, Projects.class);
        startActivity(intent);
    }
}