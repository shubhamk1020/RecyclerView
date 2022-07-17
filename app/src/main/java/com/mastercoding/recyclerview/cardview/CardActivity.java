package com.mastercoding.recyclerview.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mastercoding.recyclerview.R;
import com.mastercoding.recyclerview.normal.Planet;

import java.util.ArrayList;

public class CardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CardAdapter adapter;
    private ArrayList<PlanetCards> planetCardsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        
        InitializeCardView();
    }

    private void InitializeCardView() {

        recyclerView = findViewById(R.id.Card_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        planetCardsArrayList = new ArrayList<>();
        adapter = new CardAdapter(this,planetCardsArrayList);
        recyclerView.setAdapter(adapter);


        CreatDataForCards();

    }

    private void CreatDataForCards() {


        PlanetCards planet = new PlanetCards("Earth", 150,10,12750);
        planetCardsArrayList.add(planet);


        planet = new PlanetCards("Jupiter", 778, 26, 143000);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Mars", 228, 4, 6800);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Pluto", 5900, 1, 2320);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Venus", 108, 9, 12750);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Saturn", 1429, 11, 120000);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Mercury", 58, 4, 4900);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Neptune", 4500, 12, 50500);
        planetCardsArrayList.add(planet);
        planet = new PlanetCards("Uranus", 2870, 9, 52400);
        planetCardsArrayList.add(planet);

        adapter.notifyDataSetChanged();

    }


}