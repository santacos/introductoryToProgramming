package com.exercise;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class TriangleTest {

    @Test
    public void testEasiestExercise(){
        String result = Triangle.easiestExercise();

        assertEquals(result, "*", "result should be");
    }

    @Test
    public void testDrawHorizontalLineWithZeroLength(){
        assertEquals(Triangle.drawHorizontalLine(0), "", "result should be");
    }

    @Test
    public void testDrawHorizontalLineWithLength(){
        assertEquals(Triangle.drawHorizontalLine(8), "********", "result should be");
    }

    @Test
    public void testDrawVerticalLineWithZeroLength(){
        assertEquals(Triangle.drawVerticalLine(0), "", "result should be");
    }

    @Test
    public void testDrawVerticalLineWithLength(){
        String expect = "*\n" +
                        "*\n" +
                        "*";
        assertEquals(Triangle.drawVerticalLine(3), expect, "result should be");
    }

    @Test
    public void testDrawARightTriangleWithZeroLength(){
        assertEquals(Triangle.drawARightTriangle(0), "", "result should be");
    }

    @Test
    public void testDrawARightTriangle(){
        String expect = "*\n"+
                        "**\n"+
                        "***";
        assertEquals(Triangle.drawARightTriangle(3), expect, "result should be");
    }



}