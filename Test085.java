/*
AIM Computer Academy
Author name : Vishal Koshti
Subject : JAVA
Course : Diploma in Information Technology
Semester : 4
Program : Write a program to implement menu driven program using do-while loop. Take the input of two integer numbers from the user, then display the menu to the user to perform addition, subtraction, division, modulo and exit from the program. According to user's input perform appropriate operation on two integer numbers and dsplay the answer.
Program no. : 085
*/

import java.util.Scanner;

class Test085
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int ans = 0;
        int choice = 0;
        do
        {
            System.out.print("\nEnter the first number: ");
            num1 = scObj.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scObj.nextInt();
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Modulo");
            System.out.println("Press 6 for Exit");
            System.out.print("Enter your choice: ");
            choice = scObj.nextInt();
            switch(choice)
            {
                case 1:
                    ans = num1 + num2;
                    System.out.println("Addition is:" + ans);
                break;

                case 2:
                    ans = num1 - num2;
                    System.out.println("Subtraction is:" + ans);
                break;

                case 3:
                    ans = num1 * num2;
                    System.out.println("Multiplication is:" + ans);
                break;

                case 4:
                    ans = num1 / num2;
                    System.out.println("Division is:" + ans);
                break;

                case 5:
                    ans = num1 % num2;
                    System.out.println("Modulo is:" + ans);
                break;

                case 6:
                    System.out.println("Exit from the program");
                break;

                default:
                    System.out.println("Invalid input");
            }
        } while(choice!=6);
    }
}

/*
Output
--------------------
Enter the first number: 4
Enter the second number: 2
Press 1 for Addition
Press 2 for Subtraction
Press 3 for Multiplication
Press 4 for Division
Press 5 for Modulo
Press 6 for Exit
Enter your choice: 
5
Modulo is:0

Enter the first number: 23
Enter the second number: 23
Press 1 for Addition
Press 2 for Subtraction
Press 3 for Multiplication
Press 4 for Division
Press 5 for Modulo
Press 6 for Exit
Enter your choice: 6
Exit from the program
*/