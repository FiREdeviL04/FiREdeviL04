/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number and take input of that number from the user. Now check whether entered number is even or odd.
Program number: 049
*/

import java.util.Scanner;
class Test049
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}
	}
}

/*
output
------
Enter any integer number: 10
Entered number is even
*/