/*
AIM computer academy
Author : Vishal koshti
course : Diploma in information technology
sem : 4
program : Write a program to demonstrate the working {} curly brackets 
in if block.
program : 043
*/

import java.util.Scanner;
class Test043
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		System.out.print("Enter any integer number: ");
		num = scObj.nextInt();
		if(num == 11)
			System.out.println("I am insode of the if block");
		System.out.println("I am outside of the if block");
	}
}