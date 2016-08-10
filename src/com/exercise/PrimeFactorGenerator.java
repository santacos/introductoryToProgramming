package com.exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class PrimeFactorGenerator {

    public static boolean isPrimeNumber(int number) {
        if(number == 1) return false;
        for(int i = 2; i < number; i++) {
            if (isDivisibleBy(number, i)) return false;
        }
        return true;
    }

    public static Set<Integer> generate(int number) {
        Set<Integer> primeFactors = new HashSet<>();
        int copyOfNumber = number;

        for (int i = 2; i <= copyOfNumber; i++) {
            if (isDivisibleBy(copyOfNumber, i)) {
                primeFactors.add(i);
                copyOfNumber = getOtherFactor(copyOfNumber, i);
                i--;
            }
        }
        return primeFactors;
    }

    private static int getOtherFactor(int number, int factor) {
        return number / factor;
    }

    private static boolean isDivisibleBy(int number, int divider) {
        return number % divider == 0;
    }
}
