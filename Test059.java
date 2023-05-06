/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare one integer number which is used to store the value of day. Take the input of that variable from the user.Implement the switch case to display the day name as per user input. If user enters 1, program should display "Today is Sunday". If user enters 2. program should display "Today is Monday" and so on.
Program number: 059
*/

import java.util.Scanner;
class Test059
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);
        int day;
        System.out.println("Enter value of the day: ");
        day = scObj.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}