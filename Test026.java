/*
AIM Computer Academy
Course name: Diploma in Information Technology
Semester:4
Program: Write a program to find area of circle. Take input of radius from the user and calculate the area of circle then display the area of circle.
Program number: 026
*/

import java.util.Scanner;
class Test026
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1,num2,r,area;
		System.out.println("Enter the radius: ");
		r = scObj.nextInt();
		area = (22*r*r)/7;
		System.out.println("Area of circle is: " + area);
	}
}