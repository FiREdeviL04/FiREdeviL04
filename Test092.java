/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one dimensional integer array of size five and take the input of an array from the user. Now find the summation of all the elements of an array. Then display the summation and content of an array.
Program number: 092
*/

import java.util.Scanner;
class Test092
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0;
        int sum = 0;
        System.out.println("Take input of an array");
        for (i=0; i<5; i++)
        {
            System.out.print("Enter any number: ");
            arr[i] = scObj.nextInt();
        }

        // Find the summation of an array
        for (i=0; i<5; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("\nDisplay content of an array: ");
        for (i=0; i<5; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSummation of elements of an array: " + sum);
    }
}

/*
Output
----------------------
Take input of an array
Enter any number: 25
Enter any number: 5
Enter any number: 10
Enter any number: 15
Enter any number: 20

Display content of an array:
25 5 10 15 20
Summation of elements of an array: 75
*/