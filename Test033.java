/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare two integer variable  take input of both integer number before applying relational operators on them. display the answer of relational operators on the basis of input values.
Program number: 033
*/

import java.util.Scanner;
class Test033
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1,num2;
		System.out.println("Check less than relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 < num2)
		{
			System.out.println(num1 + " is less than " + num2);
		}
		else
		{
			System.out.println(num1 + " is not less than " + num2);
		}
		System.out.println("\n check greater than relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else
		{
			System.out.println(num1 + " is not greater than " + num2);
		}
		System.out.println("\n check less than or equals to relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 <= num2)
		{
			System.out.println(num1 + " is less than or equals to " + num2);
		}
		else
		{
			System.out.println(num1 + " is not less than or equals to " + num2);
		}
		System.out.println("\n check greater than or equals to relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 >= num2)
		{
			System.out.println(num1 + " is greater than or equals to " + num2);
		}
		else
		{
			System.out.println(num1 + " is not greater than or equals to " + num2);
		}
		System.out.println("\n check equals to relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 == num2)
		{
			System.out.println(num1 + " is equals to " + num2);
		}
		else
		{
			System.out.println(num1 + " is not equals to " + num2);
		}
		System.out.println("\n check not equals to relational operator");
		System.out.print("Enter first integr number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integr number: ");
		num2 = scObj.nextInt();
		if(num1 != num2)
		{
			System.out.println(num1 + " is not equals to " + num2);
		}
		else
		{
			System.out.println(num1 + " is equals to " + num2);
		}
	}
}