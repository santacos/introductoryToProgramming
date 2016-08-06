package com.exercise;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //print Triangle exercise
        System.out.println("----------Easiest exercise ever--------------");
        System.out.println(Triangle.easiestExercise());

        System.out.println("----------Draw a horizontal line-------------");
        System.out.println(Triangle.drawHorizontalLine(8));

        System.out.println("----------Draw a vertical line---------------");
        System.out.println(Triangle.drawVerticalLine(3));

        System.out.println("----------Draw a right line------------------");
        System.out.println(Triangle.drawARightTriangle(3));

        //Diamond Exercises
        System.out.println("----------Isosceles Triangle-----------------");
        System.out.println(Diamond.drawIsoscelesTriangle(3));

        System.out.println("----------Diamond----------------------------");
        System.out.println(Diamond.drawDiamond(3));

        System.out.println("----------Diamond with Name------------------");
        System.out.println(Diamond.drawDiamondWithName("COS", 3));

        //FizzBuzz Exercises
        System.out.println("----------FizzBuzz---------------------------");
        FizzBuzzGenerator.printFizzBuzz(15);

        //Prime Factors Exercise
        System.out.println("----------Prime Factors----------------------");
        int number = 30;
        System.out.println("Number: " + number);
        System.out.print("Prime factors: ");
        Set<Integer> primeFactors = PrimeFoctor.generate(number);
        for(Integer prime: primeFactors){
            System.out.print(prime+" ");
        }
        System.out.println("\n---------------------------------------------");





    }
}
