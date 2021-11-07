package org.project;

import java.util.Scanner;
public class task_2 {

    public static void main(String[] args) {
        double minutesSuminYear = 60 * 24 * 365;
        Scanner value = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");

        double minutes = value.nextDouble();
        long years = (long) (minutes / minutesSuminYear);
        int days = (int) (minutes /60 / 24) % 365;

        System.out.println((int) minutes + "  minutes is approximately " + years + " years and " + days + " days");


    }
}
