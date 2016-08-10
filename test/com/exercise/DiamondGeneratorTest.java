package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class DiamondGeneratorTest {

    @Test
    public void should_generate_emptyString_when_generate_diamond_withHeightOfZero(){
        assertEquals(DiamondGenerator.generateDiamond(0), "",
                "DiamondGenerator with height of zero should be empty string");
    }

    @Test
    public void should_generate_diamond_withLengthOfThree_when_input_is_three(){
        String expect = "  *\n" +
                        " ***\n" +
                        "*****\n" +
                        " ***\n" +
                        "  *";
        assertEquals(DiamondGenerator.generateDiamond(3), expect);
    }

    @Test
    public void should_generate_emptyString_when_generate_diamond_with_name_withHeightOfZero(){
        String expect = "";
        assertEquals(DiamondGenerator.generateDiamondWithName("", 0), expect,
                "DiamondGenerator with name with height of zero should be empty string");
    }

    @Test
    public void should_generate_diamondWithName_withLengthOfThree_when_input_is_three(){
        String expect = "  *\n" +
                        " ***\n" +
                        "COS\n" +
                        " ***\n" +
                        "  *";
        assertEquals(DiamondGenerator.generateDiamondWithName("COS", 3), expect);
    }


}