package com.example.recyclerviewtesting.cardviewrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewtesting.R;
import com.example.recyclerviewtesting.normalrecycler.Planet;
import com.example.recyclerviewtesting.normalrecycler.PlanetAdapter;

import java.util.ArrayList;

public class CardViewRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardViewAdapter adapter;
    private ArrayList<PlanetsCards> planetsCardsArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_recyler_view);

        InitializeCardViews();
    }

    private void InitializeCardViews() {
        recyclerView = findViewById(R.id.card_reyc);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
        planetsCardsArrayList = new ArrayList<>();
        adapter = new CardViewAdapter(this, planetsCardsArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        
        createDataForCards();
    }

    private void createDataForCards() {
        PlanetsCards planet = new PlanetsCards("Earth", 150, 9.8, 12750);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Jupiter", 778, 26, 143000);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Mars", 228, 4, 6800);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Pluto", 5900, 1, 2320);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Venus", 108, 9, 12750);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Saturn", 1429, 11, 120000);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Mercury", 58, 4, 4900);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Neptune", 4500, 12, 50500);
        planetsCardsArrayList.add(planet);
        planet = new PlanetsCards("Uranus", 2870, 9, 52400);
        planetsCardsArrayList.add(planet);
        adapter.notifyDataSetChanged();
    }
}