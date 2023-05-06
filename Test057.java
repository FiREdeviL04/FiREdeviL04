/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one character and take input of that character from the user. Now check whether entered character is in uppercase or lowercase or digit or special case.
Program number: 057
*/

import java.util.Scanner;
class Test057
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        char ch = '\0';
        System.out.print("Enter any character: ");
        ch = scObj.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
        {
            System.out.println("Entered character is uppercase letter");
        }
        else if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Entered character is lowercase letter");
        }
        else if (ch >= '0' && ch <= '9')
        {
            System.out.println("Entered character is digit");
        }
        else
        {
            System.out.println("Entered character is special case");
        }
    }
}

/*
Output
------------
Enter any character: @
Entered character is special case
*/
