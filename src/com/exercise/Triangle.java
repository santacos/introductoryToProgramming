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

    public static String generateIsoscelesTriangle(int n) {
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
}
