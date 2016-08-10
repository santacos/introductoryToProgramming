package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class TriangleGenerator {

    public static String generateARightTriangle(int height) {
        String result = "";
        for(int line = 1;line <= height; line++){
            result += LineGenerator.generateHorizontalLine(line);
            if(line < height) result += "\n";
        }
        return result;
    }

    public static String generateIsoscelesTriangle(int height) {
        String result = "";
        for(int line = 1;line <= height; line++){
            int width = 2 * line - 1;
            int startGeneratePoint = height - (line-1);
            for(int word = 1; word <= startGeneratePoint; word++){
                if(word == startGeneratePoint)
                    result += LineGenerator.generateHorizontalLine(width);
                else
                    result += " ";
            }
            if(line < height) result += "\n";
        }
        return result;
    }
}
