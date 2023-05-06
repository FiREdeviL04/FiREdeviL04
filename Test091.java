/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one dimensional integer array of size five and take the input of an array from the user. Then display the content of an array.
Program number: 091
*/

import java.util.Scanner;
class Test091
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0;
        System.out.println("Take input of an array: ");
        for (i=0; i<5; i++)
        {
            System.out.print("Enter any number: ");
            arr[i] = scObj.nextInt();
        }

        System.out.println("\nDisplay content of an array: ");
        for (i=0; i<5; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Output
------------------------
Take input of an array:
Enter any number: 10
Enter any number: 25
Enter any number: 4
Enter any number: 31
Enter any number: 7

Display content of an array:
10 25 4 31 7
*/