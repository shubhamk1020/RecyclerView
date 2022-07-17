package com.mastercoding.recyclerview.cardview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercoding.recyclerview.R;

import java.util.ArrayList;
import java.util.Locale;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.PLaneHolder2>   {

// CardAdapter Class
    private Context context2;
    private ArrayList<PlanetCards> planets;

    //constructor


    public CardAdapter(Context context2, ArrayList<PlanetCards> planets) {
        this.context2 = context2;
        this.planets = planets;
    }

    @NonNull
    @Override
    public PLaneHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context2).inflate(R.layout.card_item,
                parent,false);
        return new PLaneHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.PLaneHolder2 holder, int position) {

        PlanetCards planet = planets.get(position);
        holder.setDetails(planet);

    }

    @Override
    public int getItemCount() {
       return planets.size();
    }


    class PLaneHolder2 extends RecyclerView.ViewHolder{
        private TextView txtNameCard, txtDistanceCard, txtGravityCard, txtDiameterCard;

        public PLaneHolder2(@NonNull View itemView) {
            super(itemView);


            txtNameCard = itemView.findViewById(R.id.textNameCard);
            txtDistanceCard = itemView.findViewById(R.id.txtDistance);
            txtGravityCard = itemView.findViewById(R.id.txtGravity);
            txtDiameterCard = itemView.findViewById(R.id.txtDiameter);

        }
        void setDetails(PlanetCards planet)
        {
            txtNameCard.setText(planet.getPlanetName2());
            txtDistanceCard.setText(String.format(Locale.US,
                    "Distance from sun : %d Million KM ", planet.getDistanceFromSun2()));
            txtGravityCard.setText(String.format(Locale.US,
                    "Surface Gravity : %d N/Kg ", planet.getGravity2()));
            txtDiameterCard.setText(String.format(Locale.US,
                    "Diameter : %d KM", planet.getDiameter2()));

        }
    }

}
