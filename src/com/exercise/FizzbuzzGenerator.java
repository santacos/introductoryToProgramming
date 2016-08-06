package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class FizzBuzzGenerator {

    public static String checkFizzBuzz(int number) {
        String result = "";
        if(number % 3 == 0) result = "Fizz";
        if(number % 5 == 0) result += "Buzz";
        if(result.equals("")) result = String.valueOf(number);
        return result;
    }

    public static void printFizzBuzz(int limit){
        for(int i=1; i <= limit; i++){
            System.out.println(checkFizzBuzz(i));
        }
    }
}
