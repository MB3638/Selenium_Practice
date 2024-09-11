package org.example.selenium;

public class String_Buffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" Java");
        System.out.println("After append: " + sb.toString());

        sb.insert(6, "Learn ");
        System.out.println("After insert: " + sb.toString());

        sb.replace(6, 11, "Testing");
        System.out.println("After replace: " + sb.toString());

        sb.delete(6, 13);
        System.out.println("After delete: " + sb.toString());

        sb.reverse();
        System.out.println("After reverse: " + sb.toString());

        String str = sb.toString();
        System.out.println("StringBuffer to String: " + str);
    }
}
