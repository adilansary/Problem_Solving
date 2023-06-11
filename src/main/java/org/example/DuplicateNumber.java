package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Q14. Find out the duplicate numbers in the given array and in which position they are found.
//numbers=[1,2,3,1,2,4,5,6,4]
public class DuplicateNumber {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

            Map<Integer, List<Integer>> numberPositions = new HashMap<>();

            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];

                if (!numberPositions.containsKey(number)) {
                    numberPositions.put(number, new ArrayList<>());
                }

                numberPositions.get(number).add(i);
            }

            System.out.println("Duplicate numbers and their positions:");

            for (Map.Entry<Integer, List<Integer>> entry : numberPositions.entrySet()) {
                int number = entry.getKey();
                List<Integer> positions = entry.getValue();

                if (positions.size() > 1) {
                    System.out.println("Number: " + number+ " Positions: " + positions);
                    System.out.println();
                }
            }
        }
    }
