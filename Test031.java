/*
AIM computer academy
Author : Vishal koshti
Program : Write a program to declare two integer variables and take input of both integer numbers
perform bitwise AND, OR and XOR operations on them, and display the answer of each operation.
program number : 031
*/

import java.util.Scanner;
class Test031
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1, num2, andAnswer,orAnswer,xorAnswer;
		System.out.print("enter first integer number: ");
		num1 = scObj.nextInt();
		System.out.print("enter second integer number: ");
		num2 = scObj.nextInt();
		andAnswer = num1 & num2;
		orAnswer = num1 | num2;
		xorAnswer = num1 ^ num2;
		System.out.println("value of num1: "+ num1);
		System.out.println("value of num2: "+ num2);
		System.out.println("And operation answer "+ andAnswer);
		System.out.println("or operation answer "+ orAnswer);
		System.out.println("Xor operation answer "+ xorAnswer);
		
		System.out.println("\n Value of num1 in binary : "+ Integer.toBinaryString(num1));
		System.out.println("Value of num2 in binary : "+ Integer.toBinaryString(num2));
		System.out.println("Value of AND operation in binary : " + Integer.toBinaryString(andAnswer));
		System.out.println("Value of OR operation in binary : " + Integer.toBinaryString(orAnswer));
		System.out.println("Value of XOR operation in binary : " + Integer.toBinaryString(xorAnswer));
	}
}

/*
enter first integer number: 12
enter second integer number: 15
value of num1: 12
value of num2: 15
And operation answer 12
or operation answer 15
Xor operation answer 3

Value of num1 in binary : 1100
Value of num2 in binary : 1111
Value of AND operation in binary : 1100
Value of OR operation in binary : 1111
Value of XOR operation in binary : 11
*/