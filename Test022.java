/*
AIM Computer Academy
Course: Diploma in Information Technology
Program: Write a program to demonstrate the working of command line argument in line argument. Pass some message on command line argument and then display each argument in the program.
Program number: 022
*/

class Test022
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println("Argument " + i + "is: " + args[i]);
        }
    }
}