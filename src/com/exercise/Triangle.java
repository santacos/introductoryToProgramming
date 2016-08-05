package com.exercise;

/**
 * Created by santacos on 8/5/2016 AD.
 */
public class Triangle {

    public static String easiestExercise() {
        return "*";
    }

    public static String drawHorizontalLine(int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += "*";
        }
        return result;
    }

    public static String drawVerticalLine(int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            if(i < n-1)
                result += "*\n";
            else
                result += "*";
        }
        return result;
    }

    public static String drawARightTriangle(int n) {
        String result = "";
        for(int line = 1;line <= n; line++){
            result += drawHorizontalLine(line);
            if(line < n) result += "\n";
        }
        return result;
    }
}
