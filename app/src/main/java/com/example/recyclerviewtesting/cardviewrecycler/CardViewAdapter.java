package com.example.recyclerviewtesting.cardviewrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtesting.R;
import com.example.recyclerviewtesting.normalrecycler.Planet;

import java.util.ArrayList;
import java.util.Locale;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.PlanetHolder2> {
    private Context context2;
    private ArrayList<PlanetsCards> planets;

    public CardViewAdapter(Context context2, ArrayList<PlanetsCards> planets) {
        this.context2 = context2;
        this.planets = planets;
    }

    @NonNull
    @Override
    public PlanetHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context2).inflate(R.layout.item_card, parent, false);
        return new PlanetHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAdapter.PlanetHolder2 holder, int position) {
        PlanetsCards planet = planets.get(position);
        holder.setDetails(planet);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public class PlanetHolder2 extends RecyclerView.ViewHolder {
        private TextView txtNameCard, txtDistanceCard, txtGravityCard, txtDiameterCard;

        public PlanetHolder2(@NonNull View itemView) {
            super(itemView);
            txtNameCard = itemView.findViewById(R.id.txtNameCard);
            txtDistanceCard = itemView.findViewById(R.id.txtDistanceCard);
            txtGravityCard = itemView.findViewById(R.id.txtGravityCard);
            txtDiameterCard = itemView.findViewById(R.id.txtDiameterCard);
        }

        void setDetails(PlanetsCards planet) {
            txtNameCard.setText(planet.getPlanetName2());
            txtDistanceCard.setText(String.format(Locale.US,
                    "Distance from Sun : %d Million Km",
                    planet.getDistanceFromSun2()));
            txtGravityCard.setText(String.format(Locale.US,
                    "Surface gravity : %f N/Kg",
                    planet.getGravity2()));
            txtDiameterCard.setText(String.format(Locale.US,
                    "Diameter : %d Km",
                    planet.getDiameter2()));
        }
    }
}
