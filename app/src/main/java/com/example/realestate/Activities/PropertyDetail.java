package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.realestate.R;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetail extends AppCompatActivity {

    private AppCompatImageButton tbBack;
    private AppCompatTextView tvTbTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_detail);

        ImageSlider imageSlider = findViewById(R.id.ImageSlider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.pic3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic6, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.pic4, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        initToolbar();
    }

    private void initToolbar() {
        tbBack = findViewById(R.id.tbBack);
        tbBack.setVisibility(View.VISIBLE);
        tvTbTitle = findViewById(R.id.tvTbTitle);
        tvTbTitle.setVisibility(View.VISIBLE);
        tvTbTitle.setText("Property Detail");

        tbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}