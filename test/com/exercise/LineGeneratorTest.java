package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by santacos on 8/5/2016 AD.
 */

public class LineGeneratorTest {

    @Test
    public void should_generate_one_star(){
        assertEquals(LineGenerator.generateOneStar(), "*",
                "method generateOneStar() should generate *");
    }

    @Test
    public void should_generate_emptyString_when_generate_horizontal_line_withHeightIsZero(){
        assertEquals(LineGenerator.generateHorizontalLine(0), "",
                "Horizontal LineGenerator with height of zero should be empty string");
    }

    @Test
    public void should_generate_horizontal_line_withLengthOfEight_when_input_is_eight(){
        assertEquals(LineGenerator.generateHorizontalLine(8), "********",
                "Horizontal line with length more than zero should have expected length");
    }

    @Test
    public void should_generate_emptyString_when_generate_vertical_line_withLengthIsZero(){
        assertEquals(LineGenerator.generateVerticalLine(0), "",
                "Vertical LineGenerator with height of zero should be empty string");
    }

    @Test
    public void should_generate_vertical_line_withHeightMoreThanZero_when_input_is_more_than_zero(){
        String expect = "*\n" +
                        "*\n" +
                        "*";
        assertEquals(LineGenerator.generateVerticalLine(3), expect,
                "Vertical LineGenerator with height more than zero should have expected height");
    }



}
