/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("First number:");
        String firstNumber=sc.next();
        System.out.println("Second number:");
        String secondNumber = sc.next();
        int convertedFirstNumber=Integer.parseInt(firstNumber);
        int convertedSecondNumber=Integer.parseInt(secondNumber);
        int sum=convertedFirstNumber+convertedSecondNumber;
        int difference=convertedFirstNumber-convertedSecondNumber;
        int multiplication=convertedFirstNumber*convertedSecondNumber;
        int quotient=convertedFirstNumber/convertedSecondNumber;
        System.out.println(convertedFirstNumber+" + "+convertedSecondNumber+" = "+sum);
        System.out.println(convertedFirstNumber+" - "+convertedSecondNumber+" = "+difference);
        System.out.println(convertedFirstNumber+" * "+convertedSecondNumber+" = "+multiplication);
        System.out.println(convertedFirstNumber+" / "+convertedSecondNumber+" = "+quotient);
    }
}