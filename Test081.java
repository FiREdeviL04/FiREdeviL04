/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to print following pyramid using nested for loop.
A
B  C
D  E  F
G  H  I  J
Program number: 081
*/

import java.util.Scanner;
class Test081
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int lines = 0;
		char ch = '\0';
		System.out.print("Enter number of lines: ");
		lines = scObj.nextInt();
		ch = 'A';
		for(i=1;i<=lines;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}