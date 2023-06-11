
//Q17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
public class Palindrome{
    public static void main(String[] args) {
        String word = "madam";

        boolean isPalindrome = checkPalindrome(word);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static boolean checkPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
