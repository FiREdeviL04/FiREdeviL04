/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to demonstrate the working of break statement.
Program number: 087
*/

class Test087
{
    public static void main(String args[])
    {
        int i;
        for(i=1;i<=10;i++)
        {
            if(i==6)
            {
                break;
            }
            System.out.print(i + " ");
        }
    }
}

/*
Output
--------------
1 2 3 4 5
*/