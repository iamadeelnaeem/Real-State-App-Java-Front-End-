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
import com.example.realestate.Model.ModelBuy;
import com.example.realestate.R;

import java.util.ArrayList;
import java.util.List;

public class Buy extends AppCompatActivity {

    private AppCompatImageButton tbBack;
    private AppCompatTextView tvTbTitle;

    private RecyclerView rvBuy;
    private LinearLayoutManager lmBuy;
    private AdapterBuy adapterBuy;
    private List<ModelBuy> listModelBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        initToolbar();
        initData();
        rvBuy();
    }

    private void initToolbar() {
        tbBack = findViewById(R.id.tbBack);
        tbBack.setVisibility(View.VISIBLE);
        tvTbTitle = findViewById(R.id.tvTbTitle);
        tvTbTitle.setVisibility(View.VISIBLE);
        tvTbTitle.setText("Property Listing");

        tbBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void initData() {
        listModelBuy = new ArrayList<>();
        listModelBuy.add(new ModelBuy(R.drawable.pic1, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic2, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic3, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic4, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic5, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic6, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic7, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic8, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic9, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
        listModelBuy.add(new ModelBuy(R.drawable.pic10, "10 Marla Double Storey House", "Services Colony Block A New Satellite Town Sargodha", "PKR", "3.5", "Crore", "6", "3", "10"));
    }

    private void rvBuy() {
        rvBuy = findViewById(R.id.rvBuy);
        lmBuy = new GridLayoutManager(getApplicationContext(), 1);
        lmBuy.setOrientation(RecyclerView.VERTICAL);
        rvBuy.setLayoutManager(lmBuy);
        adapterBuy = new AdapterBuy(listModelBuy, Buy.this);
        rvBuy.setAdapter(adapterBuy);
    }
}
