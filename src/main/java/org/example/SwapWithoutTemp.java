package org.example;
//Q2.Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class SwapWithoutTemp {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            System.out.println("Initial values:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("After swapping:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
