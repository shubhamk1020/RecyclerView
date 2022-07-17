package com.mastercoding.recyclerview.cardview;

public class PlanetCards {

    private String planetName2;
    private int distanceFromSun2;
    private int gravity2;
    private int diameter2;


    // Constructor


    public PlanetCards(String planetName, int distanceFromSun2, int gravity2, int diameter2) {
        this.planetName2 = planetName;
        this.distanceFromSun2 = distanceFromSun2;
        this.gravity2 = gravity2;
        this.diameter2 = diameter2;
    }

    // Getters


    public String getPlanetName2() {
        return planetName2;
    }

    public int getDistanceFromSun2() {
        return distanceFromSun2;
    }

    public int getGravity2() {
        return gravity2;
    }

    public int getDiameter2() {
        return diameter2;
    }
}
