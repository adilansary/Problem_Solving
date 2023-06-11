package org.example;
//Q1.Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class SwapWithTemp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp;
        System.out.println("Initial values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
