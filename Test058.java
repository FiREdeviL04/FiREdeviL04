/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare 
Program number: 058
*/

import java.util.Scanner;
class Test058{
    public static void main(){
        Scanner scObj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        int choice = 0;
        System.out.println("Enter first integer number: ");
        num1 = scObj.nextInt();
        System.out.println("Enter second integer number: ");
        num2 = scObj.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
    }
}