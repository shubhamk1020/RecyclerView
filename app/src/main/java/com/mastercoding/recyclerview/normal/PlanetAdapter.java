package com.mastercoding.recyclerview.normal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastercoding.recyclerview.R;

import java.util.ArrayList;
import java.util.Locale;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlaneHolder>   {

    // Remember Adapter class has 2 classes
    // 1- Planet Adapter
    private Context context;
    private ArrayList<Planet> planets;

    // constructor


    public PlanetAdapter(Context context, ArrayList<Planet> planet) {
        this.context = context;
        this.planets = planet;
    }


    @NonNull
    @Override
    public PlaneHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(context).inflate(R.layout.planet_list_item,parent
         ,false);

         return new PlaneHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetAdapter.PlaneHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.SetDetails(planet);
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    // 2- Planet Holder
    class PlaneHolder extends RecyclerView.ViewHolder{

        private TextView txtName, txtDistance, txtGravity, txtDiameter;

        public PlaneHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtDistance = itemView.findViewById(R.id.txtDistance);
            txtGravity = itemView.findViewById(R.id.txtGravity);
            txtDiameter = itemView.findViewById(R.id.txtDiameter);
        }

        void SetDetails(Planet  planet){
            txtName.setText(planet.getPlanetName());
            txtDistance.setText(String.format(Locale.US,
                    "Distance from sun : %d Million KM ", planet.getDistanceFromSun()));
            txtGravity.setText(String.format(Locale.US,
                    "Surface Gravity : %d Nm2/Kg ", planet.getGravity()));
            txtDiameter.setText(String.format(Locale.US,
                    "Diameter  : %d KM ", planet.getDiameter()));

        }

    }
}
