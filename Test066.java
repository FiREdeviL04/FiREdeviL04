/*
Program: Write a program to declare one integer number and take input of that number from the user. Now check whether entered number is perfect number or not.
program number: 066
*/
import java.util.Scanner;
class Test066
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int i = 0;
		System.out.print("Enter any integer number:");
		num = scObj.nextInt();
		i = 1;
		while(i<= num/2)
		{
			if(num % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		if(sum == num)
		{
			System.out.println("Entered number" + num + "is perfect number");
		}
		else
		{
			System.out.println("Entered number" + num + "is not  perfect number");
		}
	}
}