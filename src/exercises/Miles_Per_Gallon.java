package exercises;

import java.util.Scanner;

public class Miles_Per_Gallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask for number of miles drive.
        System.out.println("Please enter the number of miles driven: ");
        double miles = input.nextDouble();

        //Ask for number of gallons used.
        System.out.println("Please enter the number of gallons used: ");
        double gallons = input.nextDouble();

        //Calculate and print mpg.
        double mpg = miles / gallons;
        System.out.println("You drove " + mpg + "mpg.");
        input.close();
    }
}
