/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number and take input of that number from the user. Now find the summation of even digit and odd digits of entered number.
Program number: 073
*/

import java.util.Scanner;
class Test073
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num = 0;
        int evenDigitSum = 0;
        int oddDigitSum = 0;
        int rem = 0;
        int i = 0;
        System.out.println("Enter any integer number: ");
        num = scObj.nextInt();
        for(i=num; i>0; i=i/10)
        {
            rem = i%10;
            if(rem%2==0)
            {
                evenDigitSum = evenDigitSum + rem;
            }
            else
            {
                oddDigitSum = oddDigitSum + rem;
            }
        }
        System.out.println("Summation of even digit is: "+evenDigitSum+" of entered number: "+num);
        System.out.println("Summation of odd digit is: "+oddDigitSum+ " of entered number: "+num);
    }
}