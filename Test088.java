/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to demonstrate the working of continue statement.
Program number: 088
*/

class Test088
{
    public static void main(String args[])
    {
        int i = 0;
        for(i=1;i<=10;i++)
        {
            if(i==6)
            {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

/*
Output
--------------
1 2 3 4 5 7 8 9 10
*/