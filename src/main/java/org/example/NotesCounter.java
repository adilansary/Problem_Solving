package org.example;

import java.util.Scanner;
//Q7. Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]

public class NotesCounter {
        public static void main(String[] args) {
            int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount: ");
            int amount = scanner.nextInt();

            System.out.println("Breakdown of notes for amount " + amount + ":");

            for (int note : notes) {
                if (amount >= note) {
                    int count = amount / note;
                    System.out.println(note + " - " + count);
                    amount -= note * count;
                }
            }
        }
    }
