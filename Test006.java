/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare String object and ssign String literals to them in different formats.
Program number: 006
*/

class Test006
{
	String str1 = "Vishal";
	String str2 = "AIM Computer Academy";
	String str3 = "This statement is not one line. \n " + "It is not even two line. \n" + "But it is three line ";
	public static void main(String[] args)
	{
		Test006 obj = new Test006();
		System.out.println("Value of first String literal's variable: " + obj.str1);
		System.out.println("Value of second String literal's variable: " + obj.str2);
		System.out.println("Value of third String literal's variable: " + obj.str3);
	}
}

/*
Output
--------
Value of first String literal's variable: Vishal
Value of second String literal's variable: AIM Computer Academy
Value of third String literal's variable: This statement is not one line.
 It is not even two line.
But it is three line
*/
