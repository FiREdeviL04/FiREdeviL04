/*
AIM Computer Aacademy
Author name : Vishal Koshti
Course : Diploma in information technology
Semester : 4
Program : Write a program to declare two integer variables and assign some values to them. implement
the working of short circuit operators.
Program number : 039
*/

import java.util.Scanner;
class Test039
{
	public static void main(String[] args)
	{
		Scanner scobj = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		System.out.print("Enter first integer number:");
		n1 = scobj.nextInt();
		System.out.print("Enter second integer number:");
		n2 = scobj.nextInt();
		if(n1++ > 10 && ++n2 <= 7)
		{
			n1++;
		}
		else
		{
			n2++;
		}
		System.out.println("Answer after using &&");
		System.out.println("Value of n1 is:" + n1);
		System.out.println("Value of n2 is:" + n2);
		
		System.out.println("\n Enter first integer number:");
		n1 = scobj.nextInt();
		System.out.println("Enter second integer number:");
		n2 = scobj.nextInt();
		if(++n1 > 10 && ++n2 <= 7)
		{
			n1++;
		}
		else
		{
			n2++;
		}
		System.out.println("Answer after using &&");
		System.out.println("Value of n1 is:" +n1);
		System.out.println("Value of n2 is:" +n2);
		
		System.out.println("\n Enter first integer number:");
		n1 = scobj.nextInt();
		System.out.println("Enter second integer number:");
		n2 = scobj.nextInt();
		if(n1++ > 10 || n2++ <= 7)
		{
			n1++;
		}
		else
		{
			n2++;
		}
		System.out.println("Answer after using ||");
		System.out.println("Value of n1 is:" +n1);
		System.out.println("Value of n2 is:" +n2);
		
		System.out.println("\n Enter first integer number:");
		n1 = scobj.nextInt();
		System.out.print("Enter second integer number:");
		n2 = scobj.nextInt();
		if(++n1 > 10 || n2++ <= 7)
		{
			n1++;
		}
		else
		{
			n2++;
		}
		System.out.println("Answer after using ||");
		System.out.println("Value of n1 is:" + n1);
		System.out.println("Value of n2 is:" + n2);
	}
}

# Output

E:\4th semester java>javac Test039.java

E:\4th semester java>java Test039
Enter first integer number:11
Enter second integer number:22
Answer after using &&
Value of n1 is:12
Value of n2 is:24

 Enter first integer number:
11
Enter second integer number:
33
Answer after using &&
Value of n1 is:12
Value of n2 is:35

 Enter first integer number:
11
Enter second integer number:
6
Answer after using ||
Value of n1 is:13
Value of n2 is:6

 Enter first integer number:
13
Enter second integer number:6
Answer after using ||
Value of n1 is:15
Value of n2 is:6
