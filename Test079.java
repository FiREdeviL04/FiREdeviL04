/*
AIM Computer Academy
Author name : Vishal Koshti
Course : Diploma in Information Technology
Semester : 4
Program : Write a program to print the following pyramid using nested while loop.
* * * *
 * * *
  * *
   *
Program no. : 079
*/

import java.util.Scanner;
class Test079
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int i = 0;
	    int j = 0;
	    int lines = 0;
		int space = 0;
		int temp = 0;
		System.out.print("Enter number of lines:");
		lines = scObj.nextInt();
		i = 1;
		space = 0;
		temp = lines;
		while(i <= lines)
		{
			j = 1;
			while(j <= space)
			{
				System.out.print(" ");
				j++;
			}
			space++;
			
			j = 1;
			while(j <= temp)
			{
				System.out.print(" *");
				j++;
			}
			System.out.println();
			temp--;
			i++;
		}
	}
}

/*
output:
-------
Enter number of lines:5
 * * * * *
  * * * *
   * * *
    * *
     *
*/