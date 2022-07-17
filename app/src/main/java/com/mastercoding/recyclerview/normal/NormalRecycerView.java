package com.mastercoding.recyclerview.normal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;

import com.mastercoding.recyclerview.R;

import java.util.ArrayList;

public class NormalRecycerView extends AppCompatActivity {

    RecyclerView normal_recycler;
    private PlanetAdapter adapter;
    private ArrayList<Planet> planetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_recycer_view);

        normal_recycler = findViewById(R.id.normal_recyler);
        normal_recycler.setLayoutManager(new LinearLayoutManager(this));
        planetArrayList = new ArrayList<>();
        adapter = new PlanetAdapter(this, planetArrayList);
        normal_recycler.setAdapter(adapter);
        normal_recycler.addItemDecoration(new DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL));

        createListData();
    }

    private void createListData() {

        // This Method is for adding the data to recyclerView
        // let's make adapter and planet model class

        Planet planet = new Planet("Earth", 149,10,12750);
        planetArrayList.add(planet);

        planet = new Planet("Jupiter", 780, 25,
                142800);
        planetArrayList.add(planet);

        planet = new Planet("Mars", 228, 4, 6800);
        planetArrayList.add(planet);

        planet = new Planet("Venus", 108, 9, 12100);
        planetArrayList.add(planet);

        planet = new Planet("Saturn", 1437, 11,
                120660);
        planetArrayList.add(planet);

        planet = new Planet("Mercury", 57, 4, 4800);
        planetArrayList.add(planet);

        planet = new Planet("Neptune", 4530, 11, 49500);
        planetArrayList.add(planet);

        planet = new Planet("Uranus", 2871, 9, 51800);
        planetArrayList.add(planet);

        adapter.notifyDataSetChanged();


    }

}