/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to display the value of all the truth tables of all the logical operators.
Program No: 034
*/

class Test034
{
    public static void main(String[] args)
    {
        System.out.println("\nLogical NOT");
        System.out.println("true: " + !true);
        System.out.println("false: " + !false);

        System.out.println("\nLogical XOR");
        System.out.println("false ^ false: " + (false ^ false));
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("true ^ true: " + (true ^ true));

        System.out.println("\nLogical AND");
        System.out.println("false && false: " + (false && false));
        System.out.println("false && true: " + (false && true));
        System.out.println("true && false: " + (true && false));
        System.out.println("true && true: " + (true && true));

        System.out.println("\nLogical OR");
        System.out.println("false || false: " + (false || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));
    }
}