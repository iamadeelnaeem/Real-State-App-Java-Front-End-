package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.realestate.Adapter.AdapterBuy;
import com.example.realestate.Adapter.AdapterRent;
import com.example.realestate.Model.ModelBuy;
import com.example.realestate.Model.ModelRent;
import com.example.realestate.R;

import java.util.ArrayList;
import java.util.List;

public class Rent extends AppCompatActivity {
    private AppCompatImageButton tbBack;
    private AppCompatTextView tvTbTitle;

    private RecyclerView rvRent;
    private LinearLayoutManager lmRent;
    private AdapterRent adapterRent;
    private List<ModelRent> listModelRent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
        initToolbar();
        initData();
        initRvRent();
    }

    private void initToolbar() {
        tbBack = findViewById(R.id.tbBack);
        tbBack.setVisibility(View.VISIBLE);
        tvTbTitle = findViewById(R.id.tvTbTitle);
        tvTbTitle.setVisibility(View.VISIBLE);
        tvTbTitle.setText("Rent House");

        tbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initData() {
        listModelRent = new ArrayList<>();
        listModelRent.add(new ModelRent(R.drawable.pic1, "10 Marla Double Story", "Services Colony Lahore", "20000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic2, "10 Marla Double Story", "Services Colony Lahore", "25000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic3, "10 Marla Double Story", "Services Colony Lahore", "30000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic4, "10 Marla Double Story", "Services Colony Lahore", "40000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic5, "10 Marla Double Story", "Services Colony Lahore", "20000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic6, "10 Marla Double Story", "Services Colony Lahore", "30000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic7, "10 Marla Double Story", "Services Colony Lahore", "15000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic8, "10 Marla Double Story", "Services Colony Lahore", "27000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic9, "10 Marla Double Story", "Services Colony Lahore", "20000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic1, "10 Marla Double Story", "Services Colony Lahore", "30000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic2, "10 Marla Double Story", "Services Colony Lahore", "40000", "4", "2"));
        listModelRent.add(new ModelRent(R.drawable.pic3, "10 Marla Double Story", "Services Colony Lahore", "20000", "4", "2"));
    }

    private void initRvRent() {
        rvRent = findViewById(R.id.rvRent);
        lmRent = new GridLayoutManager(getApplicationContext(), 1);
        lmRent.setOrientation(RecyclerView.VERTICAL);
        rvRent.setLayoutManager(lmRent);
        adapterRent = new AdapterRent(listModelRent, Rent.this);
        rvRent.setAdapter(adapterRent);
    }

}