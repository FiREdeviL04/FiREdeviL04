/*
 AIM computer academy
 Author : Vishal koshti
 course : diploma in information technology
 program : write a program to display all the numbers from 1 to 100 which
 are divisable by 6 using for loop.
program : 070
*/
class Test070
{
	public static void main(String[] args)
	{
		int i = 0;
		System.out.println("Numbers from 1 to 100 which are divisable by 6");
		for(i=1;i<=100;i++)
		{
			if(i%6==0)
			{
			System.out.println(i+"");
			}
		}
	}
}

/*
output:
-------
Numbers from 1 to 100 which are divisable by 6
6
12
18
24
30
36
42
48
54
60
66
72
78
84
90
96
*/
		