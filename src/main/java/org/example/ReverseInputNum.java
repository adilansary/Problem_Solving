package org.example;
import java.util.Scanner;
//Q13. Take any number as input and print the reverse of the number
public class ReverseInputNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your number: ");
            int number = scanner.nextInt();

            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }

            System.out.println("Reverse: " + reverse);

            scanner.close();
        }
    }
