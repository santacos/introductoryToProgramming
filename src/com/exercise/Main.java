package com.exercise;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //print Triangle exercise
        System.out.println("----------Easiest exercise ever--------------");
        System.out.println(Line.generateOneStar());

        System.out.println("----------Draw a horizontal line-------------");
        System.out.println(Line.generateHorizontalLine(8));

        System.out.println("----------Draw a vertical line---------------");
        System.out.println(Line.generateVerticalLine(3));

        System.out.println("----------Draw a right line------------------");
        System.out.println(Triangle.generateARightTriangle(3));

        //Diamond Exercises
        System.out.println("----------Isosceles Triangle-----------------");
        System.out.println(Triangle.generateIsoscelesTriangle(3));

        System.out.println("----------Diamond----------------------------");
        System.out.println(Diamond.generateDiamond(3));

        System.out.println("----------Diamond with Name------------------");
        System.out.println(Diamond.generateDiamondWithName("COS", 3));

        //FizzBuzz Exercises
        System.out.println("----------FizzBuzz---------------------------");
        FizzBuzzGenerator.generateListOfFizzBuzz(15);

        //Prime Factors Exercise
        System.out.println("----------Prime Factors----------------------");
        int number = 30;
        System.out.println("Number: " + number);
        System.out.print("Prime factors: ");
        Set<Integer> primeFactors = PrimeFactorGenerator.generate(number);
        for(Integer prime: primeFactors){
            System.out.print(prime+" ");
        }
        System.out.println("\n---------------------------------------------");





    }
}
