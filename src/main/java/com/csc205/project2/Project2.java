package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = (ThreeDimensionalShape) new Sphere(2.0);
        ThreeDimensionalShape cube = (ThreeDimensionalShape) new Cube(5.0);
        ThreeDimensionalShape cylinder = (ThreeDimensionalShape) new Cylinder(4.0, 1.0);
        ThreeDimensionalShape pyramid = (ThreeDimensionalShape) new Pyramid(4.0, 5.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(pyramid);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        System.out.println();
        Sphere sphere1 = new Sphere(4.0);
        System.out.println(sphere1);
        System.out.println();


        Cube cube1 = new Cube(6.0);
        System.out.println(cube1);
        System.out.println();

        Cylinder cylinder1 = new Cylinder(6.0, 2.0);
        System.out.println(cylinder1);
        System.out.println();

        Pyramid pyramid1 = new Pyramid(5.0, 3.0);
        System.out.println(pyramid1);
    }

}

