/*
Aim computer academy
Program : write a program to find area of rectangle . 
take input of length and breadth from the user and calculate the area of rectangle then display the 
area of rectangle .
program number : 029
*/

import java.util.Scanner;
class Test029
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		float areaOfRectangle,length,breadth;
		System.out.print("Enter length: ");
		length = scObj.nextInt();
		System.out.print("Enter breadth: ");
		breadth = scObj.nextInt();
		areaOfRectangle = length*breadth;
		System.out.println("Area of Rectangle: "+areaOfRectangle);
	}
}