package com.alvin.jumbojetsinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.alvin.jumbojetsinfo.adapter.CardViewAircraftAdapter;
import com.alvin.jumbojetsinfo.model.Aircraft;
import com.alvin.jumbojetsinfo.model.AircraftData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAircraft;
    private ArrayList<Aircraft> list = new ArrayList<>();
    private String title = "Jumbo Jets Info";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = "Jumbo Jets Info";
        setActionBarTitle(title);

        rvAircraft = findViewById(R.id.rv_aircraft);
        rvAircraft.setHasFixedSize(true);

        list.addAll(AircraftData.getListData());
        showRecyclerCard();
    }

    @Override
    protected void onStart() {
        super.onStart();
        String title = "Jumbo Jets Info";
        setActionBarTitle(title);
    }

    private void showRecyclerCard(){
        rvAircraft.setLayoutManager(new LinearLayoutManager(this));
        CardViewAircraftAdapter cardViewAircraftAdapter = new CardViewAircraftAdapter(list);
        rvAircraft.setAdapter(cardViewAircraftAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        goToAbout();
        return super.onOptionsItemSelected(item);
    }
    public void goToAbout() {
        title = "About";
        Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(moveIntent);

        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
