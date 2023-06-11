package org.example;

//8. Print the prime numbers of 2 to 100
public class PrimeNumber {
        public static void main(String[] args) {
            boolean[] isPrime = new boolean[101];
            for (int i = 2; i <= 100; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= 100; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= 100; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
            System.out.println("Prime numbers from 2 to 100:");
            for (int i = 2; i <= 100; i++) {
                if (isPrime[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }

