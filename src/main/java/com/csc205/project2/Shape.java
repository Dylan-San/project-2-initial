package com.csc205.project2;

public abstract class Shape implements ThreeDimensionalShape{

    protected double surfaceArea;
    protected double volume;

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }
}
