/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare three integer numbers and take input of these numbers from the user. Now find which number is minimum from three numbers.
Program number: 053
*/

import java.util.Scanner;

class Test053
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num1, num2, num3;
        num1 = num2 = num3 = 0;
        System.out.println("Enter first integer number: ");
        num1 = scObj.nextInt();
        System.out.println("Enter second integer number: ");
        num2 = scObj.nextInt();
        System.out.println("Enter third integer number: ");
        num3 = scObj.nextInt();
        if (num1 < num2)
        {
            if (num1 < num3)
            {
                System.out.println("First number is minimum");
            }
            else
            {
                System.out.println("Third number is minimum");
            }

        }
        else
        {
            if (num2 < num3)
            {
                System.out.println("Second number is minimum");
            }
            else
            {
                System.out.println("Third number is minimum");
            }
        }
    }
}

/*
Output:
----------------
Enter first integer number: 
18
Enter second integer number: 
19
Enter third integer number: 
15
Third number is minimum
*/