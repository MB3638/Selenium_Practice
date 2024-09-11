package org.example.selenium;

public class Main {


    public static void main(String[] args) {

        boolean learnJava = true;
        System.out.println("Learn Java? " + learnJava);

        byte byteValue = 127;
        short shortValue = 32000;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);

        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        char charValue = 'A';
        System.out.println("Char Value: " + charValue);


        String greeting = "Hello, World!";
        System.out.println("Greeting: " + greeting);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array Values: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        Person person = new Person("Alice", 30);
        System.out.println("Person's Name: " + person.name);
        System.out.println("Person's Age: " + person.age);
    }

}