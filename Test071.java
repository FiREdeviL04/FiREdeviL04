/*
AIM Computer Academy
Author name : Vishal Koshti
Course : Diploma in Information Technology
Semester : 4
Program : Write a program to declare one integer number and take input of that number from the user. Now check whether enterd number is Armstrong number or not.
Program number: 071
*/

import java.util.Scanner;
class Test071
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int rem = 0;
		int i = ;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		for(i=numl;i>0;i=i/10)
		{
			rem = i % 10;
			sum = sum + (rem*rem*rem);
		}
		if(sum == num)
		{
			System.out.println("Entered number" + num + " is Armstrong number ");
		}
		else
		{
			System.out.println("Entered number" + num + " is not Armstrong number ");
		}
	}
}