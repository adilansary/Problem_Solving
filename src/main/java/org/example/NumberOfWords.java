package org.example;

//Q15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//"I live in Bangladesh"
public class NumberOfWords {
        public static void main(String[] args) {
            String text = "I live in Bangladesh";

            int wordCount = countWords(text);
            int charCount = countCharacters(text);
            int vowelCount = countVowels(text);
            int consonantCount = countConsonants(text);

            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters without spaces: " + charCount);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
        }

        public static int countWords(String text) {
            String[] words = text.split("\\s+");
            return words.length;
        }

        public static int countCharacters(String text) {
            return text.replace(" ", "").length();
        }

        public static int countVowels(String text) {
            int count = 0;
            text = text.toLowerCase();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            return count;
        }

        public static int countConsonants(String text) {
            int count = 0;
            text = text.toLowerCase();

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    count++;
                }
            }

            return count;
        }
    }
