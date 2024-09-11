package org.example;

public class Java_OOPS {
    public static void main(String[] args) {
        try {
            // Encapsulation
            Watch myWatch = new Watch("Casio", "Digital");
            myWatch.displayTime();

            // Inheritance and Polymorphism
            SmartWatch mySmartWatch = new SmartWatch("Apple", "Series 7", true);
            mySmartWatch.displayTime(); // Calls the overridden method

            // Abstraction
            MechanicalWatch myMechanicalWatch = new MechanicalWatch("Rolex", "Analog", 10);
            myMechanicalWatch.displayTime(); // will be Calling the inherited method
            myMechanicalWatch.wind();  // will be calling the abstract method implemented in MechanicalWatch

            // Static keyword
            System.out.println("Total Watches Created: " + Watch.getWatchCount());

            // Final keyword
            System.out.println("Max Winding Times for " + myMechanicalWatch.getBrand() + ": " + myMechanicalWatch.getMaxWindingTimes());

            // Exception Handling
            char[] numbers = {'a','b','c'};
            System.out.println("Accessing element 4 in the array: " + numbers[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an element outside the array bounds.");
        }
    }
}
