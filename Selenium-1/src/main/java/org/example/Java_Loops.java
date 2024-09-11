package org.example;

public class Java_Loops {
    public static void main(String[] args) {

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println();

        System.out.println("While Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Number: " + j);
            j++;
        }

        System.out.println();

        System.out.println("Do-While Loop:");
        int k = 1;
        do {
            System.out.println("Number: " + k);
            k++;
        } while (k <= 5);
    }
}
