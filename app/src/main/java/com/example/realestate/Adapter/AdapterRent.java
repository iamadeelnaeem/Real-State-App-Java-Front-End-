package com.example.realestate.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realestate.Activities.PropertyDetail;
import com.example.realestate.Activities.RentDetails;
import com.example.realestate.Model.ModelRent;
import com.example.realestate.R;

import java.util.List;

public class AdapterRent extends RecyclerView.Adapter<AdapterRent.ViewHolder> {

    private List<ModelRent> listModelBuy;
    private Context context;

    public AdapterRent(List<ModelRent> listModelBuy, Context context) {
        this.listModelBuy = listModelBuy;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rent,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelRent model = listModelBuy.get(position);
        holder.ivHouse.setImageResource(model.getIvHouse());
        holder.tvHouseDetail.setText(model.getStvHouseDetail());
        holder.tvPrice.setText(model.getStvPrice());
        holder.tvBedNo.setText(model.getStvBedNo());
        holder.tvKitchen.setText(model.getStvKitchen());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(context, RentDetails.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listModelBuy.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView ivHouse;
        AppCompatTextView tvHouseDetail,tvHouseAddress,tvPrice,tvBedNo,tvKitchen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHouse = itemView.findViewById(R.id.ivHouse);
            tvHouseDetail = itemView.findViewById(R.id.tvHouseDetail);
            tvHouseAddress = itemView.findViewById(R.id.tvHouseAddress);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvBedNo = itemView.findViewById(R.id.tvBedNo);
            tvKitchen = itemView.findViewById(R.id.tvKitchen);
        }
    }
}

