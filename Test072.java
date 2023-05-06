/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number and take input of that number from the user. Now check whether entered number is prime number or not.
Program number: 072
*/

import java.util.Scanner;
class Test072
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num = 0;
        int flag = 0;
        int i = 0;
        System.out.println("Enter any integer number: ");
        num = scObj.nextInt();
        if(num==1 || num==2)
        {
            flag = 1;
        }
        else
        {
            for (i=3; i<=num/2; i++)
            {
                if(num%i==0)
                {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag==0)
        {
            System.out.println("Entered number " + num +" is a prime number");
        }
        else
        {
            System.out.println("Entered number " + num +" is not a prime number");
        }
    }
}

/*
Output
---------------------------------
Enter any integer number: 
11
Entered number 11 is a prime number
*/