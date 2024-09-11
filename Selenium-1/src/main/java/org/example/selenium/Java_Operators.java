package org.example.selenium;

public class Java_Operators {

    public static void main( String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //  Unary Operators
        int x = 5;

        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x));
        System.out.println("x-- = " + (x--));
        System.out.println("x = " + x);
        System.out.println("-x = " + (-x));
        System.out.println("!true = " + (!true));

        //  Assignment Operators
        int y = 10;

        System.out.println("\nAssignment Operators:");
        y += 5;
        System.out.println("y += 5 -> y = " + y);
        y -= 2;
        System.out.println("y -= 2 -> y = " + y);
        y *= 3;
        System.out.println("y *= 3 -> y = " + y);
        y /= 3;
        System.out.println("y /= 3 -> y = " + y);
        y %= 3;
        System.out.println("y %= 3 -> y = " + y);

        //  Relational Operators
        int m = 10;
        int n = 20;

        System.out.println("\nRelational Operators:");
        System.out.println("m == n: " + (m == n));
        System.out.println("m != n: " + (m != n));
        System.out.println("m > n: " + (m > n));
        System.out.println("m < n: " + (m < n));
        System.out.println("m >= n: " + (m >= n));
        System.out.println("m <= n: " + (m <= n));

        //  Logical Operators
        boolean p = true;
        boolean q = false;

        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        //  Bitwise Operators
        int bit1 = 5;
        int bit2 = 3;

        System.out.println("\nBitwise Operators:");
        System.out.println("bit1 & bit2: " + (bit1 & bit2));
        System.out.println("bit1 | bit2: " + (bit1 | bit2));
        System.out.println("bit1 ^ bit2: " + (bit1 ^ bit2));
        System.out.println("~bit1: " + (~bit1));
        System.out.println("bit1 << 2: " + (bit1 << 2));
        System.out.println("bit1 >> 2: " + (bit1 >> 2));
        System.out.println("bit1 >>> 2: " + (bit1 >>> 2));

        //  Ternary Operator
        int ternaryResult = (a > b) ? a : b;

        System.out.println("\nTernary Operator:");
        System.out.println("Result of (a > b) ? a : b: " + ternaryResult);

        //  Instanceof Operator
        String name = "Java";

        System.out.println("\nInstanceof Operator:");
        System.out.println("Is 'name' an instance of String?: " + (name instanceof String));
    }
}
