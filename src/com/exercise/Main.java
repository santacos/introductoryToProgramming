package com.exercise;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //print TriangleGenerator exercise
        System.out.println("----------Easiest exercise ever--------------");
        System.out.println(LineGenerator.generateOneStar());

        System.out.println("----------Draw a horizontal line-------------");
        System.out.println(LineGenerator.generateHorizontalLine(8));

        System.out.println("----------Draw a vertical line---------------");
        System.out.println(LineGenerator.generateVerticalLine(3));

        System.out.println("----------Draw a right line------------------");
        System.out.println(TriangleGenerator.generateARightTriangle(3));

        //DiamondGenerator Exercises
        System.out.println("----------Isosceles TriangleGenerator-----------------");
        System.out.println(TriangleGenerator.generateIsoscelesTriangle(3));

        System.out.println("----------DiamondGenerator----------------------------");
        System.out.println(DiamondGenerator.generateDiamond(3));

        System.out.println("----------DiamondGenerator with Name------------------");
        System.out.println(DiamondGenerator.generateDiamondWithName("COS", 3));

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
