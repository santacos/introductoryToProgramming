package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class DiamondTest {

    @Test
    public void should_generate_emptyString_when_generate_diamond_withHeightOfZero(){
        assertEquals(Diamond.generateDiamond(0), "",
                "Diamond with height of zero should be empty string");
    }

    @Test
    public void should_generate_diamond_withLengthOfThree_when_input_is_three(){
        String expect = "  *\n" +
                        " ***\n" +
                        "*****\n" +
                        " ***\n" +
                        "  *";
        assertEquals(Diamond.generateDiamond(3), expect);
    }

    @Test
    public void should_generate_emptyString_when_generate_diamond_with_name_withHeightOfZero(){
        String expect = "";
        assertEquals(Diamond.generateDiamondWithName("", 0), expect,
                "Diamond with name with height of zero should be empty string");
    }

    @Test
    public void should_generate_diamondWithName_withLengthOfThree_when_input_is_three(){
        String expect = "  *\n" +
                        " ***\n" +
                        "COS\n" +
                        " ***\n" +
                        "  *";
        assertEquals(Diamond.generateDiamondWithName("COS", 3), expect);
    }


}