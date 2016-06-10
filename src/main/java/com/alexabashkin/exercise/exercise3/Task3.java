package com.alexabashkin.exercise.exercise3;

import java.math.BigInteger;
/**
 * Class Task3 contains methods for finding the sum of the digits in the number 100! (i.e. 100 factorial) {Correct answer: 648}
 * @author Aleksandr Abashkin
 * @version 1.0
 */
public class Task3 {
        public static int showResult() {
        // for processing large numbers
        System.out.println(factorial(100));

        BigInteger fact;
        // factorial of 1! is 1
        fact = new BigInteger("1");
        // Loop to calculate the factorial of 100!
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));// multiply all the numbers in order
        }
        System.out.println(fact + "______");
        System.out.println(sumDigits(fact.toString()));
        return sumDigits(fact.toString());
    }

    // sum of elements in a row
    private static int sumDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = Integer.parseInt(s.substring(i, i + 1));// Select an element
            sum = sum + j;// sum the current item (the amount) with the following
        }
        return sum;
    }

    public static long factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

}


