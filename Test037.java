/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare two integer numbers and take input of one number from the user.
Now apply all possible increment and decrement operation on those two variables. Display the value of both 
variables after each operation.
Program No. : 037
*/

import java.util.Scanner;
class Test037
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int x,y;
		System.out.println("Enter any integer number: ");
		x = scObj.nextInt();
		y = x;
		System.out.println("y = x");
		System.out.println("x = " + x + ", y = " + y);
		
		y = ++x;
		System.out.println("\n y = ++x");
		System.out.println("x = " + x + ", y = " + y);
		
		y = x++;
		System.out.println("\n y = x++");
		System.out.println("x = " + x + ", y = " + y);
		
		y = x--;
		System.out.println("\n y = x--");
		System.out.println("x = " + x + ", y = " + y);
		
		y = ++x;
		System.out.println("\n y = ++x");
		System.out.println("x = " + x + ", y = " + y);
		
		y = --x;
		System.out.println("\n y = --x");
		System.out.println("x = " + x + ", y = " + y);
		
		y = ++x;
		System.out.println("\n y = ++x");
		System.out.println("x = " + x + ", y = " + y);
		
		y = x--;
		System.out.println("\n y = x--");
		System.out.println("x = " + x + ", y = " + y);
		
		y = x++;
		System.out.println("\n y = x++");
		System.out.println("x = " + x + ", y = " + y);
		
		y = --x;
		System.out.println("\n y = --x");
		System.out.println("x = " + x + ", y = " + y);
	}
}

/*
output:
-------
Enter any integer number:
11
y = x
x = 11, y = 11

 y = ++x
x = 12, y = 12

 y = x++
x = 13, y = 12

 y = x--
x = 12, y = 13

 y = ++x
x = 13, y = 13

 y = --x
x = 12, y = 12

 y = ++x
x = 13, y = 13

 y = x--
x = 12, y = 13

 y = x++
x = 13, y = 12

 y = --x
x = 12, y = 12
*/
		
		
		
		