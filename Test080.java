/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to print following pyramid using nested for loop.
1
2  3
4  5  6
7  8  9  10
Program number: 080
*/

import java.util.Scanner;
class Test080
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int lines = 0;
		int num = 0;
		System.out.print("Enter number of lines: ");
		lines = scObj.nextInt();
		num = 1;
		for(i=1;i<=lines;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}