/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare one integer number and take input of that number from the user. Now find the summation of all the digits of entered number.
Program number: 067
*/

import java.util.Scanner;
class Test067
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int temp = 0;
		int rem = 0;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		temp = num;
		while(temp > 0)
		{
			rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		System.out.println("Summation of digit is: " + sum + " of entered number:" + num);
	}
}