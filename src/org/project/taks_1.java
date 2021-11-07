package org.project;

import java.util.Scanner;
public class taks_1 {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = value.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
