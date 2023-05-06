/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to display all the numbers from 1 to 100 which are divisible by 3 using while loop.
Program number: 064
*/

class Test064
{
    public static void main(String[] args)
    {
        int i = 1;
        System.out.println("The numbers from 1 to 100 divisible by 3");
        while(i <= 100)
        {
            if(i % 3 == 0)
            {
                System.out.println(i + " ");
            }
            i++;
        }
    }
}

/*
Output
---------------------------------------------------------------------
The numbers from 1 to 100 divisible by 3
3 
6 
9 
12 
15 
18 
21 
24 
27 
30 
33 
36 
39 
42 
45 
48 
51 
54 
57 
60 
63 
66 
69 
72 
75 
78 
81 
84 
87 
90 
93 
96 
99 
*/