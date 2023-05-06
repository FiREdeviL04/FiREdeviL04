/*
AIM Computer Academy
Author name : Vishal Koshti
Course : Diploma in information technology
Semester : 4
Program : Write a program to declare one integer number and take input of that number and take input of that number from the
user. Now display all the divisors of entered number.
Program number : 065
*/

import java.util.Scanner;
class Test065
{
	public static void main(String[] args)
	{
		Scanner scobj = new Scanner(System.in);
		int num = 0;
		int i = 0;
		System.out.print("Enter any integer number:");
		num = scobj.nextInt();
		System.out.println("Divisor of" +num+" are");
		i = 1;
		while(i<=num)
		{
			if(num%i==0)
			{
				System.out.print(i+ "");
			}
			i++;
		}
	}
}

# Output
E:\4th semester java>javac Test065.java

E:\4th semester java>java Test065
Enter any integer number:11
Divisor of11 are
111
