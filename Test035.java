/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare three integer numbers and take input of those numbers from the user. Now find maximum number from these numbers using LOGICAL and operator. Display appropriate answer at the end
Program No: 035
*/

import java.util.Scanner;

class Test035
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first integer number: ");
        num1 = scObj.nextInt();
        System.out.println("Enter second integer number: ");
        num2 = scObj.nextInt();
        System.out.println("Enter third integer number: ");
        num3 = scObj.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println("First number is maximum");
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("Second number is maximum");
        }
        else
        {
            System.out.println("Third number is maximum");
        }
    }
}

/*
Enter first integer number: 
22
Enter second integer number: 
21
Enter third integer number: 
30
Third number is maximum
*/