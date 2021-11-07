package org.project;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
    Scanner value = new Scanner(System.in);

    System.out.print("Input weight in pounds: ");
    double weight = value.nextDouble();

    System.out.print("Input height in inches: ");
    double height = value.nextDouble();

    double BMI = (weight * 0.45359237 ) / ( height * 0.0254 * height * 0.0254); // 1 pound=.45359237 Kg and 1 inch=.0254 meters.
    System.out.println("Body Mass Index is " + BMI);

    }
}
