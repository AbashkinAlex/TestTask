package com.alexabashkin.exercise.exercise1;
/**
 * To solve task1 used the formula for calculating the numbers Catalana
 * @author Aleksandr Abashkin
 * @version 1.0
 */
public class Task1 {
    public static long showResult(long numberOfBrakets) {
        long l, totalSum;
        // If numberOfBrakets = 0, the first number Catalana - is 1
        if (numberOfBrakets == 0) {
            return 1;
        } else {
            totalSum = 0;        // Temporary variable, which will accumulate the totalSum
            for (l = 0; l < numberOfBrakets; l++) {
                // To already accumulated the totalSum of the product of two numbers add Catalan
                totalSum = totalSum + showResult(l) * showResult((numberOfBrakets - 1) - l);
            }
            return totalSum;
        }
    }
}
