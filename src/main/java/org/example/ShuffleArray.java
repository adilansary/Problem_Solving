package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//Q12. Write a program that will shuffle (values will randomly change their position) from the given array
//
//numbers=[1,2,3,4,5,6,7,8,9,0]
public class ShuffleArray {
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

            // Convert array to list
            List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

            // Shuffle the list
            Collections.shuffle(numberList);

            // Convert back to array
            Integer[] shuffledNumbers = numberList.toArray(new Integer[0]);

            // Print the shuffled array
            System.out.println(Arrays.toString(shuffledNumbers));
        }
    }
