package org.project;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Input start number of the range: ");
        int startRange = value.nextInt();
        System.out.print("Input end number if the range ");
        int endRange = value.nextInt();
        int randomNumber = startRange + (int)(Math.random() * ((endRange - startRange)));

        System.out.println(randomNumber);

    }

}

