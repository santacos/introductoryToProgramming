package com.exercise;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class PrimeFactorGeneratorTest {


    @Test
    public void should_not_make_one_as_prime(){
        assertFalse(PrimeFactorGenerator.isPrimeNumber(1), "1 should not be prime");
    }

    @Test
    public void should_make_three_as_prime(){
        assertTrue(PrimeFactorGenerator.isPrimeNumber(3), "3 should be prime");
    }

    @Test
    public void should_not_make_even_number_as_prime(){
        assertFalse(PrimeFactorGenerator.isPrimeNumber(4), "even number should never be prime");
    }

    @Test
    public void should_not_have_prime_factors_when_number_is_one(){
        Set<Integer> expect = new HashSet();
        assertEquals(PrimeFactorGenerator.generate(1), expect, "1 should not have prime factors");
    }

    @Test
    public void should_make_five_and_seven_as_prime_factor_Of_thirtyFive(){
        Set<Integer> expect = new HashSet<>();
        expect.addAll(Arrays.asList(7, 5));
        assertEquals(PrimeFactorGenerator.generate(35), expect, "35 should have 5,7 as prime factors");
    }



}