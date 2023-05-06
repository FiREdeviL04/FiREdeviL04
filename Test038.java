/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare four integer numbers and take input of those numbers from the user. Now implement the increment/decrement expression with different combination. Display the value of all variables and final answer of expression.
Program No: 038
*/

import java.util.Scanner;

class Test038
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int n1, n2, n3, n4, ans;
        System.out.print("Enter first integer number: ");
        n1 = scObj.nextInt();
        System.out.print("Enter second integer number: ");
        n2 = scObj.nextInt();
        System.out.print("Enter third integer number: ");
        n3 = scObj.nextInt();
        System.out.print("Enter fourth integer number: ");
        n4 = scObj.nextInt();
        ans = n1++ - --n2 + n3++ - n4-- + n1++ + ++n2 - --n3 + n4++ - ++n3 - n2++;
        System.out.println("Value of n1 is: " + n1);
        System.out.println("Value of n2 is: " + n2);
        System.out.println("Value of n3 is: " + n3);
        System.out.println("Value of n4 is: " + n4);
        System.out.println("Value of ans is: " + ans);
    }
}