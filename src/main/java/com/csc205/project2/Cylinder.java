package com.csc205.project2;

public class Cylinder implements ThreeDimensionalShape {

    private double height;
    private double radius;

    public Cylinder(double v, double v1) {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double y){
        super();
        this.height = y;
        this.radius = y;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double surfaceArea() {
        return (2.0 * Math.PI * Math.pow(radius, 2)) + (2.0 * Math.PI * radius * height);
    }

    public double volume() {
        return  Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void surfaceArea(double index) {

    }

    @Override
    public void volume(double index) {

    }
}
