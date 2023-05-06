/*
AIM Computer Academy
Author name : Vishal Koshti
Author name : Vishal Koshti
Subject : JAVA
Course : Diploma in Information Technology
Semester : 4
Program : Write a program to print following pyramid using nested for loop.
1
2 3
3 4 5
4 5 6 7
Program no. : 084
*/

import java.util.Scanner;
class Test084
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int lines = 0;
        int num = 0;
        System.out.print("Enter number of lines : ");
        lines = scObj.nextInt();
        for(i=1;i<=lines;i++)
        {
            num = i;
            for(j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

/*
Output
------------------------------
Enter number of lines : 4
1 
2 3 
3 4 5 
4 5 6 7
*/