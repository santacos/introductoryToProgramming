package com.exercise;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class PrimeFoctorTest {

    @Test
    public void testCheckPrimeFactorWithPrimeInput(){
        assertTrue(PrimeFoctor.isPrimeNumber(3));
    }

    @Test
    public void testCheckPrimeFactorWithNonPrime(){
        assertFalse(PrimeFoctor.isPrimeNumber(4));
    }

    @Test
    public void testGeneratePrimeFactorShouldReturnEmptyList(){
        Set<Integer> expect = new HashSet<>();
        assertEquals(PrimeFoctor.generate(1), expect);
    }

    @Test
    public void testGeneratePrimeFactor(){
        Set<Integer> expect = new HashSet<>();
        expect.addAll(Arrays.asList(7, 5));
        assertEquals(PrimeFoctor.generate(35), expect);
    }



}