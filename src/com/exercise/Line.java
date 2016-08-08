package com.exercise;

/**
 * Created by santacos on 8/8/2016 AD.
 */
public class Line {

    public static String generateOneStar() {
        return generateHorizontalLine(1);
    }

    public static String generateHorizontalLine(int n) {
        return drawString(n, false);
    }

    private static String drawString(int numberOfStars, boolean shouldHaveLineBreakBetweenEachStar){
        String result = "";
        for(int i = 0; i < numberOfStars; i++){
            result += "*";
            if(shouldHaveLineBreakBetweenEachStar) result += "\n";
        }
        return result.trim();
    }

    public static String generateVerticalLine(int n) {
        return drawString(n, true);
    }


}
