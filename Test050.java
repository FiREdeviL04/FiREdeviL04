/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare two integer number and take input of that number from the user. Now find which number is larger among two numbers.
Program number: 050
*/

import java.util.Scanner;
class Test050
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
		if(num1 > num2)
		{
			System.out.println("first number is larger than second number");
		}
		else
		{
			System.out.println("Second number is larger than first number");
		}
	}
}

/*
output
------
Enter first integer number: 20
Enter second integer number: 10
first number is larger than second number
*/