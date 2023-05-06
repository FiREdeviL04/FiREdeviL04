/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare one intger and take input of the number from the user. Now check
whether entered number is greater then 100. If it is greater than 100 then display approprite message else
do nothing.
Program No. : 046
*/

import java.util.Scanner;
class Test046
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		if(num > 100)
		{
			System.out.println("Entered number is greater than 100");
		}
		System.out.println("Outside of if block");
	}
}

/*
output:
-------
Enter any integer number: 11
Outside of if block
*/