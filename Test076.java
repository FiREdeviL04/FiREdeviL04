/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to print following pyramid using nested while loop.
        *
    * * *
  * * * *
* * * * *
the number if lines should be input by the user.
Program number: 076
*/

import java.util.Scanner;
class Test076
{
    public static void main(String[] main)
    {
        Scanner scObj = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int lines = 0;
        int space = 0;
        System.out.println("Enter number of lines: ");
        lines = scObj.nextInt();
        i = 1;
        space = lines - 1;
        while (i <= lines)
        {
            j = 1;
            while (j <= space)
            {
                System.out.print(" ");
                j++;
            }
            space--;

            j = 1;
            while (j <= i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}