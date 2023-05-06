/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare eight variable of each and every datatypes of java. Take the inout from the user of each variable and then display the value of each value.
Program number: 024
*/

import java.util.Scanner;
class Test024
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		byte byteVar;
		short shortVar;
		int intVar;
		long longVar;
		float floatVar;
		double doubleVar;
		boolean booleanVar;
		char charVar;
		System.out.println("Take input of each and every variables");
		System.out.print("Enter value for byte variable: ");
		byteVar = scObj.nextByte();
		System.out.print("Enter value for short variable: ");
		shortVar = scObj.nextShort();
		System.out.print("Enter value for integer variable: ");
		intVar = scObj.nextInt();
		System.out.print("Enter value for long variable: ");
		longVar = scObj.nextLong();
		System.out.print("Enter value for float variable: ");
		floatVar = scObj.nextFloat();
		System.out.print("Enter value for double variable: ");
		doubleVar = scObj.nextDouble();
		System.out.print("Enter value for boolean variable: ");
		booleanVar = scObj.nextBoolean();
		System.out.print("Enter value for character variable: ");
		charVar = scObj.next().charAt(0);
		System.out.println("\n display the value of each and every variables: ");
		System.out.println("The value of byte variable is: " + byteVar);
		System.out.println("The value of short variable is: " + shortVar);
		System.out.println("The value of int variable is: " + intVar);
		System.out.println("The value of long variable is: " + longVar);
		System.out.println("The value of float variable is: " + floatVar);
		System.out.println("The value of double variable is: " + doubleVar);
		System.out.println("The value of boolean variable is: " + booleanVar);
		System.out.println("The value of char variable is: " + charVar);
	}
}

	