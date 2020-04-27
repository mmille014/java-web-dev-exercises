package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle of radius " + radius + " is: " + area + ".");
    }
}