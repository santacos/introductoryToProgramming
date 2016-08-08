package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class FizzBuzzGenerator {

    public static String generate(int number) {
        String result = "";
        if(number % 3 == 0) result = "Fizz";
        if(number % 5 == 0) result += "Buzz";
        if(result.equals("")) result = String.valueOf(number);
        return result;
    }

    public static String generateListOfFizzBuzz(int limitNumber) {
        String result = "";
        for(int i = 1; i <= limitNumber; i++){
            result += generate(i) + "\n";
        }
        return result.trim();
    }
}
