package org.example;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum;
        int num1, num2;
        char continueInput = 'y';

        while (continueInput == 'y') {
            // Prompt the user for two numbers
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            // Calculate the sum of the two numbers
            sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another pair of numbers? (y/n): ");
            continueInput = scanner.next().charAt(0);  // Read user input as a char
        }
    }
}
