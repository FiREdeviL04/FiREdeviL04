/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one string variable to take input of course name. Implement the switch case to display the cut off percentage of entered course. Implement the program using switch case
Program number: 061
*/

import java.util.Scanner;
class Test061
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        String courseName = new String();
        System.out.println("You can select any one of the course from the following");
        System.out.println("1). BCA");
        System.out.println("2). MCA");
        System.out.println("3). Diploma");
        System.out.println("4). Degree");
        System.out.println("5). B.Tech");
        System.out.println("6). M.Tech");
        System.out.println("Enter the course name you want to select: ");
        courseName = scObj.nextLine();
        switch(courseName)
        {
            case "BCA":
                System.out.println("The cut off of the BCA is 75%");
                break;
            case "MCA":
                System.out.println("The cut off of the MCA is 85%");
                break;
            case "Diploma":
                System.out.println("The cut off of the Diploma is 60%");
                break;
            case "Degree":
                System.out.println("The cut off of the Degree is 65%");
                break;
            case "B.Tech":
                System.out.println("The cut off of the B.Tech is 75%");
                break;
            case "M.Tech":
                System.out.println("The cut off of the M.Tech is 80%");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

/*
Output
---------------------------------------------------------------------
You can select any one of the course from the following
1). BCA
2). MCA
3). Diploma
4). Degree
5). B.Tech
6). M.Tech
Enter the course name you want to select: 
MCA
The cut off of the MCA is 85%
*/