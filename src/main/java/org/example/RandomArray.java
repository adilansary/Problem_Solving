package org.example;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
        public static void main(String[] args) {
            int[] numbers = new int[10];
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            System.out.println("Numbers in the array:");
            System.out.println(Arrays.toString(numbers));

            int maxNumber = Integer.MIN_VALUE;
            int minNumber = Integer.MAX_VALUE;
            for (int num : numbers) {
                if (num > maxNumber) {
                    maxNumber = num;
                }
                if (num < minNumber) {
                    minNumber = num;
                }
            }
            System.out.println("Max number: " + maxNumber);
            System.out.println("Min number: " + minNumber);
        }
    }


