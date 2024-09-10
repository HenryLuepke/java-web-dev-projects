package org.launchcode;
import java.util.Scanner;

public class MPGCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?: ");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?: ");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;

        System.out.println("Your car is running on " + mpg + " mpg.");
    }
}
