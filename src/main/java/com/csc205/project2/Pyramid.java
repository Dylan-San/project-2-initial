package com.csc205.project2;

public class Pyramid extends Shape {


        private double height;
        private double edge;

        public Pyramid() {
            super();
            this.height = 0.0;
            this.edge = 0.0;
        }

        public Pyramid(double height, double edge) {
            super();
            this.height = height;
            this.edge = edge;
        }

        public double getEdge(){
            return edge;
        }

        public double getHeight(){
            return height;
        }

        public void setEdge(double edge){
            this.edge = edge;
        }

        public void setHeight(double height){
            this.height = height;
        }

        public double surfaceArea() {
            return (Math.pow(edge, 2)) + (2.0 * edge * (Math.sqrt((Math.pow(edge, 2)/4.0)+(Math.pow(height, 2)))));
        }

        public double volume() {
            return  Math.pow(edge, 2) * (height/3.0);
        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("height=").append(height);
        sb.append(", edge=").append(edge);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }



    @Override
    public double calculateSurfaceArea(double surfaceArea) {
        return 0;
    }

    @Override
    public double calculateVolume(double volume) {
        return 0;
    }
}


