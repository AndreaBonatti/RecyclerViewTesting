package com.example.recyclerviewtesting.cardviewrecycler;

public class PlanetsCards {
    private String planetName2;
    private int distanceFromSun2;
    private double gravity2;
    private int diameter2;

    public PlanetsCards(String planetName2, int distanceFromSun2, double gravity2, int diameter2) {
        this.planetName2 = planetName2;
        this.distanceFromSun2 = distanceFromSun2;
        this.gravity2 = gravity2;
        this.diameter2 = diameter2;
    }

    public String getPlanetName2() {
        return planetName2;
    }

    public int getDistanceFromSun2() {
        return distanceFromSun2;
    }

    public double getGravity2() {
        return gravity2;
    }

    public int getDiameter2() {
        return diameter2;
    }
}
