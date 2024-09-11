package org.example;

import java.util.*;

public class Java_Collections {
    public static void main(String[] args) {

        // ArrayList
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Apple");
        System.out.println("List:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        // HashSet
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        System.out.println("\nSet:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

        // HashMap
        Map<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "Apple");
        fruitMap.put(2, "Banana");
        fruitMap.put(3, "Orange");
        fruitMap.put(1, "Grapes");
        System.out.println("\nMap:");
        for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
