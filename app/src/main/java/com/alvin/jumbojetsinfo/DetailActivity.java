package com.alvin.jumbojetsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.alvin.jumbojetsinfo.model.Aircraft;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {

    String title = "Aircraft Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String title = "Aircraft Detail";
        setActionBarTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Intent in = getIntent();

        ImageView imgPhoto;
        TextView tvName, tvDetail, manufacturer, country, price, seats, engine, maxCruiseSpeed, travelRange;

        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);
        manufacturer = findViewById(R.id.manufacturer);
        country = findViewById(R.id.country);
        price = findViewById(R.id.price);
        seats = findViewById(R.id.seats);
        engine = findViewById(R.id.engine);
        maxCruiseSpeed = findViewById(R.id.maxCruiseSpeed);
        travelRange = findViewById(R.id.travelRange);

        Drawable aircraftImage = getResources().getDrawable(in.getIntExtra("aircraftPhoto", 0));
        imgPhoto.setImageDrawable(aircraftImage);
        tvName.setText(in.getStringExtra("aircraftName"));
        tvDetail.setText(in.getStringExtra("aircraftDetail"));
        manufacturer.setText(in.getStringExtra("aircraftManufacturer"));
        country.setText(in.getStringExtra("aircraftCountry"));
        price.setText(in.getStringExtra("aircraftPrice"));
        seats.setText(in.getStringExtra("aircraftSeats"));
        engine.setText(in.getStringExtra("aircraftEngine"));
        maxCruiseSpeed.setText(in.getStringExtra("aircraftMaxCruiseSpeed"));
        travelRange.setText(in.getStringExtra("aircraftTravelRange"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }


}
