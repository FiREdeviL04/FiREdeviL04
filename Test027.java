/*
AIM Computer Academy
Course name: Diploma in Information Technology
Semester:4
Program: Write a program to find area of square. Take input of radius from the user and calculate the area of square then display the area of square.
Program number: 027
*/

import java.util.Scanner;
class Test027
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int side,area;
		System.out.println("Enter the Side of Square: ");
		side = scObj.nextInt();
		area = side*side;
		System.out.println("Area of square is: " + area);
	}
}