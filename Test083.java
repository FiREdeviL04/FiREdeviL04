/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to print following pyramid using nested for loop.
1
1  2
1  2  3
1  2  3  4
Program number: 083
*/

import java.util.Scanner;
class Test083
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
		for(i=1;i<=lines;i++)
		{	
			num = 1;
			for(j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}
}

/*
output:
-------
Enter number of lines: 5
1
12
123
1234
12345
*/