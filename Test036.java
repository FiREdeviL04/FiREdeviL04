/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare one character variable and take input of it from the user. Now check whether entered character is vowel or not using LOGICAL OR Operator. Display appropriate answer at the end.
Program No: 036
*/

import java.util.Scanner;

class Test036
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        char ch;
        System.out.println("Enter any character: ");
        ch = scObj.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Entered character is a vowel");
        }
        else
        {
            System.out.println("Entered character is not a vowel");
        }
    }
}

/*
Output

Enter any character: 
i
Entered character is a vowel
*/