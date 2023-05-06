/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare an array of size three,and assign some values to them.Display the contents of array with for-each loop. Also perform the addition of all the elements of the array using for-each loop.
Program number: 086
*/

import java.util.Scanner;
class Test086
{
	public static void main(String[] args)
	{
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.print("Print the content of array using enhanced for loop: ");
		for(int i : arr)
		{
			System.out.print(i+"");
		}
		int sum = 0;
		for(int i:arr)
		{
			sum = sum + i;
		}
		System.out.println("\nSummation of array element is:"+ sum);
	}
}

/*
output:
-------
Print the content of array using enhanced for loop: 102030
 Summation of array element is:60
*/