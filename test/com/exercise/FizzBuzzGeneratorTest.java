package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class FizzBuzzGeneratorTest {
    @Test
    public void should_generate_Fizz_when_input_is_divisible_by_three(){
        assertEquals(FizzBuzzGenerator.generate(3), "Fizz", "It should generate Fizz when input is 3");
        assertEquals(FizzBuzzGenerator.generate(6), "Fizz", "It should generate Fizz when input is 6");
    }

    @Test
    public void should_generate_Buzz_when_input_is_divisible_by_five(){
        assertEquals(FizzBuzzGenerator.generate(5), "Buzz", "It should generate Buzz when input is 5");
        assertEquals(FizzBuzzGenerator.generate(10), "Buzz", "It should generate Buzz when input is 10");
    }

    @Test
    public void should_generate_FizzBuzz_when_input_is_divisible_by_fifteen(){
        assertEquals(FizzBuzzGenerator.generate(15), "FizzBuzz", "It should generate FizzBuzz when input is 15");
        assertEquals(FizzBuzzGenerator.generate(30), "FizzBuzz", "It should generate FizzBuzz when input is 30");
    }

    @Test
    public void should_generate_number_when_input_isNotDivisibleBy_three_or_five(){
        assertEquals(FizzBuzzGenerator.generate(16), "16", "It should generate number when the number is not divisible by three or five");
        assertEquals(FizzBuzzGenerator.generate(1), "1", "It should generate number when the number is not divisible by three or five");
    }


    @Test
    public void should_generate_list_of_FizzBuzz_numbers_fromOneToFifteen(){
        String expect = "1\n" +
                        "2\n" +
                        "Fizz\n" +
                        "4\n" +
                        "Buzz\n" +
                        "Fizz\n" +
                        "7\n" +
                        "8\n" +
                        "Fizz\n" +
                        "Buzz\n" +
                        "11\n" +
                        "Fizz\n" +
                        "13\n" +
                        "14\n" +
                        "FizzBuzz";


        assertEquals(FizzBuzzGenerator.generateListOfFizzBuzz(15), expect,
                "It should generate FizzBuzz number for every numbers from 1 to 15");


    }
}