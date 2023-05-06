/*
Aim computer academy
Program : write a program to generate the mark sheet of a student . take the information of students such as roll number and store it in the integer
variable . take five more float numbers from the user to store the marks of five subjects . 
declare two more float numbers to store the total and percentage of the student which
should be calculate through the program . at last display all the information of students in proper format .
program number : 030
*/

import java.util.Scanner;
class Test030
{
	public static void main(String[] args)
	{
		Scanner scObj = new Scanner(System.in);
		int rollNo;
		float marks1,marks2,marks3,marks4,marks5,total,percentage;
		System.out.print("Enter roll Number: ");
		rollNo = scObj.nextInt();
		System.out.print("Enter marks 1: ");
		marks1 = scObj.nextFloat();
		System.out.print("Enter marks 2: ");
		marks2 = scObj.nextFloat();
		System.out.print("Enter marks 3: ");
		marks3 = scObj.nextFloat();
		System.out.print("Enter marks 4: ");
		marks4 = scObj.nextFloat();
		System.out.print("Enter marks 5: ");
		marks5 = scObj.nextFloat();
		total = marks1+marks2+marks3+marks4+marks5;
		percentage =  total/4;
		System.out.println("Roll Number: "+rollNo);
		System.out.println("marks 1 is : " +marks1);
		System.out.println("marks 2 is : "+marks2);
		System.out.println("Marks 3 is : "+marks3);
		System.out.println("Marks 4 is : "+marks4);
		System.out.println("Marks 5 is : "+marks5);
		System.out.println("Total is: "+total);
		System.out.println("Percentage is: "+percentage); 
	}
}