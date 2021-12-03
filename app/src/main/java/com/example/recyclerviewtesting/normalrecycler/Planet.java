package com.example.recyclerviewtesting.normalrecycler;

public class Planet {
    private String planetName;
    private int distanceFromSun;
    private double gravity;
    private int diameter;

    public Planet(String planetName, int distanceFromSun, double gravity, int diameter) {
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

    public double getGravity() {
        return gravity;
    }

    public int getDiameter() {
        return diameter;
    }
}
