/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to print following pyramid using nested for loop.
1
A  B
2  3  4
C  D  E  F
Program number: 082
*/

import java.util.Scanner;
class Test082
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int lines = 0;
		int num = 0;
		char ch = '\0';
		System.out.print("Enter number of lines: ");
		lines = scObj.nextInt();
		num = 1;
		ch = 'A';
		for(i=1;i<=lines;i++)
		{
			if(i%2!=0)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(num);
					num++;
				}
				System.out.println();
			}
			else
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
}

/*
output:
-------
Enter number of lines: 5
1
AB
234
CDEF
56789
*/