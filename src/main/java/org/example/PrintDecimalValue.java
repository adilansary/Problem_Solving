package org.example;
//Q3. Suppose a=15.5276. print the value upto 2 decimal point. Output: a=15.52
public class PrintDecimalValue {

        public static void main(String[] args) {
            double a = 15.5276;

            String TwoDecimalValue = String.format("%.2f", a);

            System.out.println("a = " + TwoDecimalValue);
        }
    }

