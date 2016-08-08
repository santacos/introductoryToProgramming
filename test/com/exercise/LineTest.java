package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by santacos on 8/5/2016 AD.
 */

public class LineTest {

    @Test
    public void should_generate_one_star(){
        String result = Line.generateOneStar();

        assertEquals(result, "*", "result should be *");
    }

    @Test
    public void testDrawHorizontalLineWithLength(){
        assertEquals(Line.generateHorizontalLine(8), "********", "result should be");
    }

    @Test
    public void testDrawVerticalLineWithZeroLength(){
        assertEquals(Line.generateVerticalLine(0), "", "result should be");
    }

    @Test
    public void testDrawVerticalLineWithLength(){
        String expect = "*\n" +
                        "*\n" +
                        "*";
        assertEquals(Line.generateVerticalLine(3), expect, "result should be");
    }

    @Test
    public void testDrawHorizontalLineWithZeroLength(){
        assertEquals(Line.generateHorizontalLine(0), "", "result should be");
    }
}
