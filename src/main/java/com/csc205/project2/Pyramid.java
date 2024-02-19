package com.csc205.project2;

public class Pyramid implements ThreeDimensionalShape {


        private double height;
        private double edge;

        public Pyramid(double v, double v1) {
            super();
            this.height = 0.0;
            this.edge = 0.0;
        }

        public Pyramid(double z){
            super();
            this.height = z;
            this.edge = z;
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
        final StringBuilder sb = new StringBuilder("Pyramid{");
        sb.append("height=").append(height);
        sb.append(", edge=").append(edge);
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


