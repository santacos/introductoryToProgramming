package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class Diamond {

    public static String drawIsoscelesTriangle(int n) {
        String result = "";
        for(int line = 1;line <= n; line++){
            int maxBound = n + (line - 1);
            for(int word = 1; word <= maxBound; word++){
                int startDrawPoint = n - (line-1);
                if(word >= startDrawPoint)
                    result += "*";
                else
                    result += " ";
            }
            if(line < n) result += "\n";
        }
        return result;
    }

    public static String drawDiamond(int n) {
        String result = "";
        String upperTriangle = drawIsoscelesTriangle(n);
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

    public static String drawDiamondWithName(String name, int n) {
        if(n < 0) throw new IllegalArgumentException("n should be more than 0");

        String diamond = drawDiamond(n);
        String[] lines = diamond.split("\n");
        if(n > 1) lines[n - 1] = name;

        return String.join("\n", lines);
    }
}
