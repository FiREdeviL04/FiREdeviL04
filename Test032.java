/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare three integer variable and take the input of all three integer 
numbers from the user. Apply shift operator on those numbers and display the answer.
Program No. : 032
*/

import java.util.Scanner;
class Test032
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num1,num2,num3,leftAnswer,rightAnswer,unsignedRightAnswer,unsignedRightAnswer2;
		System.out.print("Enter first integer number: ");
		num1 = scObj.nextInt();
		System.out.print("Enter second integer number: ");
		num2 = scObj.nextInt();
		System.out.print("Enter third integer number: ");
		num3 = scObj.nextInt();
		leftAnswer = num1 << 2;
		rightAnswer = num2 >> 1;
		unsignedRightAnswer = num3 >>> 1;
		System.out.println("Value of num1: " + num1);
		System.out.println("Value of num2: " + num2);
		System.out.println("Value of num3: " + num3);
		System.out.println("Shift left answer by 2 bits: " + leftAnswer);
		System.out.println("Shift right answer by 1 bits: " + rightAnswer);
		System.out.println("Unsigned shift right answer by 1 bits: " + unsignedRightAnswer);
		
		System.out.println("\n Value of num1 in binary: " + Integer.toBinaryString(num1));
		System.out.println("Value of num2 in binary: " + Integer.toBinaryString(num2));
		System.out.println("Value of num3 in binary: " + Integer.toBinaryString(num3));
		System.out.println("Value of Shift left operation in binary: " + Integer.toBinaryString(leftAnswer));
		System.out.println("Value of Shift right operation in binary: " + Integer.toBinaryString(rightAnswer));
		System.out.println("Value of Unsigned shift right operation in binary: " + Integer.toBinaryString(unsignedRightAnswer));
	}
}

/*
output:
-------
Enter first integer number: 22
Enter second integer number: 33
Enter third integer number: 23
Value of num1: 22
Value of num2: 33
Value of num3: 23
Shift left answer by 2 bits: 88
Shift right answer by 1 bits: 16
Unsigned shift right answer by 1 bits: 11

 Value of num1 in binary: 10110
Value of num2 in binary: 100001
Value of num3 in binary: 10111
Value of Shift left operation in binary: 1011000
Value of Shift right operation in binary: 10000
Value of Unsigned shift right operation in binary: 1011
*/