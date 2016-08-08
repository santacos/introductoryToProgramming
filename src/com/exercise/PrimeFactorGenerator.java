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
            if (number % i == 0) return false;
        }
        return true;
    }

    public static Set<Integer> generate(int number) {
        Set<Integer> primefactors = new HashSet<>();
        int copyOfNumber = number;

        for (int i = 2; i <= copyOfNumber; i++) {
            if (copyOfNumber % i == 0) {
                primefactors.add(i);
                copyOfNumber = copyOfNumber/i;
                i--;
            }
        }
        return primefactors;
    }
}
