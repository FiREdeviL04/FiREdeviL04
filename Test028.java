/*
AIM Computer Academy
Course name: Diploma in Information Technology
Semester:4
Program: Write a program to find area of square. Take input of base and height from the user and calculate the area of triangle then display the area of triangle.
Program number: 028
*/

import java.util.Scanner;
class Test028
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int height,base,area;
		System.out.println("Enter the Height of Triangle: ");
		height = scObj.nextInt();
		System.out.println("Enter the Base of Triangle: ");
		base = scObj.nextInt();
		area = (base*height)/2;
		System.out.println("Area of Triangles is: " + area);
	}
}