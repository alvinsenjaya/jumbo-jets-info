package com.alvin.jumbojetsinfo.adapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alvin.jumbojetsinfo.DetailActivity;
import com.alvin.jumbojetsinfo.R;
import com.alvin.jumbojetsinfo.model.Aircraft;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class CardViewAircraftAdapter extends RecyclerView.Adapter<CardViewAircraftAdapter.CardViewViewHolder> {

    private ArrayList<Aircraft> listAircraft;

    public CardViewAircraftAdapter(ArrayList<Aircraft> list) {
        this.listAircraft = list;
    }

    @NonNull
    @Override
    public CardViewAircraftAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_aircraft, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewAircraftAdapter.CardViewViewHolder holder, int position) {
        final Aircraft aircraft = listAircraft.get(position);
        Glide.with(holder.itemView.getContext())
                .load(aircraft.getPhoto())
                .apply(new RequestOptions().override(770, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(aircraft.getName());
        holder.tvDetail.setText(aircraft.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                Intent in = new Intent(v.getContext(), DetailActivity.class);

                in.putExtra("aircraftPhoto", aircraft.getPhoto());
                in.putExtra("aircraftName", aircraft.getName());
                in.putExtra("aircraftDetail", aircraft.getDetail());
                in.putExtra("aircraftManufacturer", aircraft.getManufacturer());
                in.putExtra("aircraftCountry", aircraft.getCountry());
                in.putExtra("aircraftPrice", aircraft.getPrice());
                in.putExtra("aircraftSeats", aircraft.getSeats());
                in.putExtra("aircraftEngine", aircraft.getEngine());
                in.putExtra("aircraftMaxCruiseSpeed", aircraft.getMaxCruiseSpeed());
                in.putExtra("aircraftTravelRange", aircraft.getTravelRange());

                startActivity(v.getContext(), in, b);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAircraft.size();
    }

    static class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnMoreInformation;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
