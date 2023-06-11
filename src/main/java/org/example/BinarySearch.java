package org.example;
import java.util.Arrays;

// Q4. Write a program that will find your key is found in the given array using binary search method numbers=[1,6,9,3,5,4,7], key=5

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        Arrays.sort(numbers);
        int index = binarySearch(numbers, key);
        if (index != -1) {
            System.out.print("The Sorted array is:");
            System.out.println(Arrays.toString(numbers));
            System.out.println("Key=" + key + " found at index " + index + " in the sorted array");
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    }

