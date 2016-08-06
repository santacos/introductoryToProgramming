package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class FizzBuzzGeneratorTest {
    @Test
    public void testFizzNumber(){
        assertEquals(FizzBuzzGenerator.checkFizzBuzz(3), "Fizz");
    }

    @Test
    public void testBuzzNumber(){
        assertEquals(FizzBuzzGenerator.checkFizzBuzz(5), "Buzz");
    }

    @Test
    public void testFizzBuzzNumber(){
        assertEquals(FizzBuzzGenerator.checkFizzBuzz(15), "FizzBuzz");
    }

    @Test
    public void testNormalNumber(){
        assertEquals(FizzBuzzGenerator.checkFizzBuzz(16), "16");

        assertEquals(FizzBuzzGenerator.checkFizzBuzz(1), "1");
    }

    @Test
    public void testPrintAllFizzBuzz(){
        FizzBuzzGenerator.printFizzBuzz(15);
    }


}