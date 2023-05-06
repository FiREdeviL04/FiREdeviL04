/*
AIM Computer Aacademy
Author name : Vishal Koshti
Course : Diploma in information technology
Semester : 4
Program : Write a program to declare three integer numbers and take input of these numbers from
the user. Now find which number is maximum from three numbers. 
Program number : 052
*/

import java.util.Scanner;
class Test052
{
	public static void main(String[] args )
	{
		Scanner scobj = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("Enter first integer number:");
		num1 = scobj.nextInt();
		System.out.print("Enter second integer number:");
		num2 = scobj.nextInt();
		System.out.print("Enter third integer number:");
		num3 = scobj.nextInt();
		if(num1 > num2)
		{
			if(num1 >num3)
			{
				System.out.println("First number is maximum");
			}
			else
			{
				System.out.println("Third number is maximum");
			}
		}
		else 
		{
		