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
import com.example.realestate.Model.ModelBuy;
import com.example.realestate.R;

import java.util.List;

public class AdapterBuy extends RecyclerView.Adapter<AdapterBuy.ViewHolder> {

    private List<ModelBuy> listModelBuy;
    private Context context;

    public AdapterBuy(List<ModelBuy> listModelBuy, Context context) {
        this.listModelBuy = listModelBuy;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buy,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelBuy model = listModelBuy.get(position);
        holder.ivHouse.setImageResource(model.getIvHouse());
        holder.tvHouseDetail.setText(model.getStvHouseDetail());
        holder.tvHouseDescription.setText(model.getStvHouseDescription());
        holder.tvCurrency.setText(model.getStvCurrency());
        holder.tvPrice.setText(model.getStvPrice());
        holder.tvPriceDetail.setText(model.getStvPriceDetail());
        holder.tvBedNo.setText(model.getStvBedNo());
        holder.tvBathNo.setText(model.getStvBathNo());
        holder.tvMarlaNo.setText(model.getStvMarlaNo());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(context, PropertyDetail.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listModelBuy.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder {

        AppCompatImageView ivHouse;
        AppCompatTextView tvHouseDetail,tvHouseDescription,tvCurrency,tvPrice,tvPriceDetail,
                tvBedNo,tvBathNo,tvMarlaNo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHouse = itemView.findViewById(R.id.ivHouse);
            tvHouseDetail = itemView.findViewById(R.id.tvHouseDetail);
            tvHouseDescription = itemView.findViewById(R.id.tvHouseDescription);
            tvCurrency = itemView.findViewById(R.id.tvCurrency);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvPriceDetail = itemView.findViewById(R.id.tvPriceDetail);
            tvBedNo = itemView.findViewById(R.id.tvBedNo);
            tvBathNo = itemView.findViewById(R.id.tvBathNo);
            tvMarlaNo = itemView.findViewById(R.id.tvMarlaNo);

        }
    }
}

