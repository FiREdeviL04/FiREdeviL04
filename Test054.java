/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number and take input of these numbers from the user. Now check whether the entered number is positive or negative, after checking for positivity and negativity check whether entered number is odd or ever.
Program number: 054
*/

import java.util.Scanner;
class Test054
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter any integer number: ");
        num = scObj.nextInt();
        if (num > 0)
        {
            if (num % 2 == 0)
            {
                System.out.println("Entered number is positive even");
            }
            else
            {
                System.out.println("Entered number is positive odd");
            }
        }
        else
        {
            if (num % 2 == 0)
            {
                System.out.println("Entered number is negative even");
            }
            else
            {
                System.out.println("Entered number is negative odd");
            }
        }
    }
}

/*
Output:
----------------
Enter any integer number: 21
Entered number is positive odd
*/