package com.exercise;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class PrimeFoctor {

    public static boolean isPrimeNumber(int number) {
        for(int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static Set<Integer> generate(long number) {
        Set<Integer> primefactors = new HashSet<>();
        long copyOfNumber = number;

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
