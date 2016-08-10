package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleGeneratorTest {

    @Test
    public static void should_return_emptyString_when_generate_Isosceles_WithHeightOfZero(){
        assertEquals(TriangleGenerator.generateIsoscelesTriangle(0), "",
                "method should generate empty string when length is 0");
    }

    @Test
    public static void should_generate_isosceles_withExpectedHeight_when_input_is_moreThanZero(){
        String expect = "  *\n" +
                        " ***\n" +
                        "*****";
        assertEquals(TriangleGenerator.generateIsoscelesTriangle(3), expect,
                "It should generate a isosceles triangle with height of 3 when input is 3");
    }

    @Test
    public void should_return_empty_string_when_generate_aRightTriangle_withHeightOfZero(){
        assertEquals(TriangleGenerator.generateARightTriangle(0), "",
                "method should generate empty string when input is 0");
    }

    @Test
    public void should_generate_right_triangle_withHeightOfThree_when_input_is_three(){
        String expect = "*\n"+
                        "**\n"+
                        "***";
        assertEquals(TriangleGenerator.generateARightTriangle(3), expect,
                "It should generate a right triangle with height of 3 when input is 3");
    }



}