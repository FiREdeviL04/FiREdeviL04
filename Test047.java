/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number and take input of that number from the user. Now check whether entered number is positive or negative.
Program number: 048
*/

import java.util.Scanner;
class Test047
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		if(num == 0)
		{
			System.out.println("Entered number is zero");
		}
		System.out.println("Outside of if block");
		
	}
}