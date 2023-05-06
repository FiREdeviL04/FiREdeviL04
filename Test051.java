/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare two integer number and take input of that number from the user. Now find which number is smaller among two numbers.
Program number: 051
*/

import java.util.Scanner;
class Test051
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.print("Enter first integer number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integer number: ");
		num2 = scObj.nextInt();
		if(num1 < num2)
		{
			System.out.println("first number is smaller than second number");
		}
		else
		{
			System.out.println("Second number is smaller than first number");
		}
	}
}

/*
output
------
Enter first integer number: 20
Enter second integer number: 10
Second number is smaller than first number
*/