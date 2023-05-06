/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare two integer numbers and take input of it from the user . Now perform the addition, subtraction, multiplication, division and modulo of two integre number and display the answer of all operations.
Program number: 025
*/

import java.util.Scanner;
class Test025
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1,num2,additionAnswer,subtractAnswer,multiplicationAnswer,divisionAnswer,moduloAnswer;
		System.out.print("Enter first integer number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integer number: ");
		num2 = scObj.nextInt();
		additionAnswer = num1 + num2;
		subtractAnswer = num1 - num2;
		multiplicationAnswer = num1 * num2;
		divisionAnswer = num1 / num2;
		moduloAnswer = num1 % num2;
		System.out.println("\n Answer of all arithmetic operations");
		System.out.println("Addition answer is: " +additionAnswer);
		System.out.println("subtraction answer is: " +subtractAnswer);
		System.out.println("multiplication answer is: " +multiplicationAnswer);
		System.out.println("division answer is: " +divisionAnswer);
		System.out.println("modulo answer is: " +moduloAnswer);
	}
}
		
		