package org.example;

public class Encrypt {
        public static void main(String[] args) {
            String word = "ROADTOSDET";
            String encryptedWord = encrypt(word);
            System.out.println("Encrypted word: " + encryptedWord);
        }
        public static String encrypt(String word) {
            StringBuilder encrypted = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    int originalAscii = (int) currentChar;
                    int newAscii = (originalAscii - 'A' + 5) % 26 + 'A';
                    char encryptedChar = (char) newAscii;
                    encrypted.append(encryptedChar);
                } else {
                    encrypted.append(currentChar);
                }
            }

            return encrypted.toString();
        }
    }
