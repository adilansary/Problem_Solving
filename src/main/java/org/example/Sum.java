import java.util.Scanner;
//Q18. Write a program that will take integer numbers as user input continuously and print the sum of numbers
// until user input q from the keyboard. When user input q,
// program will be quit. If user inputs another character, then the program will ask to input the number again.
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
               // System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
