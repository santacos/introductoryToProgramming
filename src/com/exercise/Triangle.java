package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class Triangle {

    public static String generateARightTriangle(int n) {
        String result = "";
        for(int line = 1;line <= n; line++){
            result += Line.generateHorizontalLine(line);
            if(line < n) result += "\n";
        }
        return result;
    }
}
