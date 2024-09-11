package org.example.selenium;

public class Java_String {

    public static void main(String[] args) {

        String str = "Let's learn JAVA!";

        int length = str.length();
        System.out.println("Length: " + length);

        char charAt = str.charAt(0);
        System.out.println("Character at index 0: " + charAt);

        String substring1 = str.substring(7);
        System.out.println("Substring from index 7: " + substring1);

        String substring2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring2);

        boolean contains = str.contains("JAVA");
        System.out.println("Contains 'JAVA': " + contains);

        boolean equals = str.equals("Let's learn JAVA!");
        System.out.println("Equals 'Let's learn JAVA!': " + equals);

        boolean equalsIgnoreCase = str.equalsIgnoreCase("let's learn java!");
        System.out.println("Equals ignore case 'let's learn java!': " + equalsIgnoreCase);

        int compareTo = str.compareTo("Let's learn JAVA!");
        System.out.println("Compare to 'Let's learn JAVA!': " + compareTo);

        int compareToIgnoreCase = str.compareToIgnoreCase("let's, learn, java!");
        System.out.println("Compare to ignore case 'let's, learn, java!': " + compareToIgnoreCase);

        int indexOfChar = str.indexOf('J');
        System.out.println("Index of 'J': " + indexOfChar);

        int indexOfStr = str.indexOf("JAVA");
        System.out.println("Index of 'JAVA': " + indexOfStr);

        int lastIndexOfChar = str.lastIndexOf('A');
        System.out.println("Last index of 'A': " + lastIndexOfChar);

        boolean startsWith = str.startsWith("Let's");
        System.out.println("Starts with 'Let's': " + startsWith);

        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);

        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        String replacedChar = str.replace('A', 'O');
        System.out.println("Replaced 'A' with 'O': " + replacedChar);

        String replacedSeq = str.replace("JAVA", "Testing");
        System.out.println("Replaced 'JAVA' with 'Testing': " + replacedSeq);

        String[] split = str.split(", ");
        System.out.println("Split by ', ': " + java.util.Arrays.toString(split));

        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        String joined = String.join(", ", "Java", "is", "fun");
        System.out.println("Joined: " + joined);

        String valueOfInt = String.valueOf(123);
        System.out.println("Value of int 123: " + valueOfInt);

        char[] charArray = str.toCharArray();
        System.out.println("Character array: " + java.util.Arrays.toString(charArray));

        String interned = str.intern();
        System.out.println("Interned string: " + interned);

        boolean matches = str.matches("let's learn java!");
        System.out.println("Matches 'let's learn java!': " + matches);

        String formatted = String.format("I have %d apples", 5);
        System.out.println("Formatted string: " + formatted);

    }
}
