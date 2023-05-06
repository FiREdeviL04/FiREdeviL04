/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one character variable and take input of that input of that variable from the user. Now check whether entered character is uppercase or not, If entered character is uppercase then check whether it is vowel or consonant. If entered character is not uppercase then check if it is lowercase or not. If entered character is lowercase then check whether it is vowel or consonant.
Program number: 055
*/

import java.util.Scanner;
class Test055
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        char ch = '\0';
        System.out.print("Enter any character: ");
        ch = scObj.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
        {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                System.out.println("Entered character is uppercase vowel");
            }
            else
            {
                System.out.println("Entered character is uppercase consonant");
            }
        }
        else{
            if (ch >= 'a' && ch <= 'z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    System.out.println("Entered character is lowercase vowel");
                }
                els
                {
                    System.out.println("Entered character is lowercase consonant");
                }
            }
            else
            {
                System.out.println("Entered character is not an alphabet");
            }
        }
    }
}