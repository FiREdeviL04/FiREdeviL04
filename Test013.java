/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to print first 10 natural number using for loop and also perform the addition of those numbers. Declare the variable for
Program number: 013
*/

class Test013
{
    public static void main(String[] args)
    {
        System.out.println("First 10 natural numbers are: ");
        for(int i=1, sum=0; i<=10; i++)
        {
            sum += i;
            System.out.println(i + " ");
        }
        // System.out.println("Sum of first 10 natural number is: " + sum); // Line-1
    }
}