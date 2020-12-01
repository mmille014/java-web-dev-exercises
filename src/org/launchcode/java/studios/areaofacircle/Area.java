package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        //Removed the following 2 lines because I added a Circle class and made a call to that class for the same information.
        //double pi = 3.14;
        //double area = pi * radius * radius;

        Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));

        // Did Not Include The Bonus Mission:
        // 2.5.4. Bonus Missions¶
        // Add validation to your program. If the user enters a negative number? a non-numeric character? the empty string? Print an error message and quit. You’ll need to peek ahead to learn about conditional syntax in Java.
        // Extend your program further by using a while or do-while loop, so that when the user enters a negative number they are re-prompted.
        input.close();
    }
}