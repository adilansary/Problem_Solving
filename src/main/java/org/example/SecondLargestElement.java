package org.example;
//Q11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}
