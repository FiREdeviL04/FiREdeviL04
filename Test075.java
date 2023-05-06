/*
AIM computer academy
Author : Vishal koshti
program : Write a program to print following pyramid usimg nested while loop.
***
**
*
the number of lines should  be input by user.
program : 075
*/

import java.util.Scanner;
class Test075
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int lines = 0;
		int temp = 0;
		System.out.print("Enter number of lines:");
		lines = scObj.nextInt();
		temp = lines;
		i = 1;
		while(i <= lines)
		{
			j = 1;
			while(j <= temp)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			temp--;
			i++;
		}
	}
}
				
