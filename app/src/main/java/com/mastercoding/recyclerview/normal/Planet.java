package com.mastercoding.recyclerview.normal;

public class Planet {

    private String planetName;
    private int distanceFromSun;
    private int gravity;
    private int diameter;


    // Constructor


    public Planet(String planetName, int distanceFromSun, int gravity, int diameter) {
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.gravity = gravity;
        this.diameter = diameter;

    }

    public String getPlanetName() {
        return planetName;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getGravity() {
        return gravity;
    }

    public int getDiameter() {
        return diameter;
    }

   }
