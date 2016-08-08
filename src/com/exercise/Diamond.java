package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class Diamond {

    public static String generateDiamond(int n) {
        String result = "";
        String upperTriangle = Triangle.generateIsoscelesTriangle(n);
        String lowerTriangle = verticalFlipTriangle(upperTriangle, n - 1);

        if(n > 0) result = upperTriangle + "\n" + lowerTriangle;
        return result;
    }

    private static String verticalFlipTriangle(String triangle, int limitLine) {
        String[] lines = triangle.split("\n");
        String result = "";

        for(int i = lines.length - 1;i >= 0; i--){
            if(i < limitLine){
                result += lines[i];
                if(i > 0) result += "\n";
            }
        }
        return result;
    }

    public static String generateDiamondWithName(String name, int n) {
        if(n < 0) throw new IllegalArgumentException("n should be more than 0");

        String diamond = generateDiamond(n);
        String[] lines = diamond.split("\n");
        if(n > 1) lines[n - 1] = name;

        return String.join("\n", lines);
    }
}
