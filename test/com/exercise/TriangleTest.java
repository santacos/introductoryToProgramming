package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {

    @Test
    public void should_return_empty_string_when_lengthOfLine_is_zero(){
        assertEquals(Triangle.generateARightTriangle(0), ""
                , "method should generate empty string when length is zero");
    }

    @Test
    public void should_generate_right_triangle_with_height_Of_3_when_lengthOfLine_is_three(){
        String expect = "*\n"+
                        "**\n"+
                        "***";
        assertEquals(Triangle.generateARightTriangle(3), expect
                , "should generate a right triangle with height of 3 when lengthOfLine is three");
    }



}