/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare two integer numbers. Take the input of both integer numbers from the user. Now find largest number among these two integer numbers and store it in third integer variable. Display the value of variables at the end. Implement the program using conditional operator.
Program No: 041
*/

import java.util.Scanner;
class Test041
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int largeNumber = 0;
        System.out.print("Enter first integer number: ");
        n1 = scObj.nextInt();
        System.out.print("Enter second integer number: ");
        n2 = scObj.nextInt();
        largeNumber = n1 > n2 ? n1 : n2;
        System.out.println("The value of n1 is: " + n1);
        System.out.println("The value of n2 is: " + n2);
        System.out.println("The value of largest number is: " + largeNumber);
    }
}

// Output
// ----------------------
// Enter first integer number: 10
// Enter second integer number: 5
// The value of n1 is: 10
// The value of n2 is: 5
// The value of largest number is: 10