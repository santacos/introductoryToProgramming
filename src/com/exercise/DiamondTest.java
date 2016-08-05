package com.exercise;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class DiamondTest {

    @Test
    public void testIsoscelesTriangleWithZeroLength(){
        String expect = "";
        assertEquals(Diamond.drawIsoscelesTriangle(0),expect);
    }

    @Test
    public void testIsoscelesTriangle(){
        String expect = "  *\n" +
                        " ***\n" +
                        "*****";
        assertEquals(Diamond.drawIsoscelesTriangle(3),expect);
    }

    @Test
    public void testDiamondWithZeroLength(){
        String expect = "";
        assertEquals(Diamond.drawDiamond(0),expect);
    }

    @Test
    public void testDiamond(){
        String expect = "  *\n" +
                        " ***\n" +
                        "*****\n" +
                        " ***\n" +
                        "  *";
        assertEquals(Diamond.drawDiamond(3),expect);
    }

    @Test
    public void testDiamondWithNameWithZeroLength(){
        String expect = "";
        assertEquals(Diamond.drawDiamondWithName("", 0),expect);
    }

    @Test
    public void testDiamondWithName(){
        String expect = "  *\n" +
                        " ***\n" +
                        "COS\n" +
                        " ***\n" +
                        "  *";
        assertEquals(Diamond.drawDiamondWithName("COS", 3),expect);
    }


}