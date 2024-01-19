package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

import com.example.realestate.R;

public class Projects extends AppCompatActivity {
    private AppCompatImageButton tbBack;
    private AppCompatTextView tvTbTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        initToolbar();
    }

    private void initToolbar() {
        tbBack = findViewById(R.id.tbBack);
        tbBack.setVisibility(View.VISIBLE);
        tvTbTitle = findViewById(R.id.tvTbTitle);
        tvTbTitle.setVisibility(View.VISIBLE);
        tvTbTitle.setText("Projects");

        tbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}