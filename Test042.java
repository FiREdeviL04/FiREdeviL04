/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare two integer numbers. Take the input of both integer numbers from the user. Now find larger number among these two integer numbers. If first number is larger than second number then perform the subtraction on these two numbers and if first number smaller than perform the addition on these two numbers. Display the value of all variables at the end. Implement the program using conditional operator.
Program No: 042
*/

import java.util.Scanner;
class Test042
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int answer = 0;
        System.out.print("Enter first integer number: ");
        n1 = scObj.nextInt();
        System.out.print("Enter second integer number: ");
        n2 = scObj.nextInt();
        answer = n1 > n2 ? (n1 - n2) : (n1 + n2);
        System.out.println("The value of n1 is: " + n1);
        System.out.println("The value of n2 is: " + n2);
        System.out.println("The answer of operation is: " + answer);
    }
}

// Output
// ----------------------
// Enter first integer number: 10
// Enter second integer number: 5
// The value of n1 is: 10
// The value of n2 is: 5
// The answer of operation is: 5