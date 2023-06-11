package org.example;

//q10. Write a program that will give following output:
//12345
//2345
//345
//45
//5
public class ReverseNumberPyramid {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = i; j <= 5; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }

