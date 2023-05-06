/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to demonstrate the working of command line argument in line argument. Pass two integer numbers on command line. Perform the addition of both the numbers and find the average. At last display summation and average. argument and then display each argument in the program.
Program number: 023
*/

class Test023
{
    public static void main(String[] args)
    {
        int num1, num2, sum;
        float average;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        sum = num1 + num2;
        average = (float)sum / 2;
        System.out.println("Value of first integer number: " + num1);
        System.out.println("Value of second integer number: " + num2);
        System.out.println("Sum of two numbers: " + sum);
        System.out.println("Average of two numbers: " + average);
    }
}