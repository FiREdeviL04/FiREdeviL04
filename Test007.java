/*
Subject : JAVA
Course : IT
semester : 4
Program : Write a program to declare various variable of different datatypes and assign the value at the time of decalration and display them. Then reassign all the variables and display them again.
Program no : 007
*/

class Test007
{
	public static void main(String[] args)
	{
		boolean booleanVar = false;
		char charVar = 'C';
		int intVar = 254;
		double doubleVar = 123.456;
		System.out.println("Value of variables at the time of decalration");
		System.out.println("Value of boolean variables: " + booleanVar);
		System.out.println("Value of character variables: " + charVar);
		System.out.println("Value of integer variables: " + intVar);
		System.out.println("Value of double variables: " + doubleVar);
		booleanVar = true;
		charVar = 'P';
		intVar = 317;
		doubleVar = 987.654;
		System.out.println("\n Value of variables after the reassignment");
		System.out.println("Value of boolean variables: " + booleanVar);
		System.out.println("Value of character variables: " + charVar);
		System.out.println("Value of integer variables: " + intVar);
		System.out.println("Value of double variables: " + doubleVar);
	}
}
/*
Output
------
Value of variables at the time of decalration
Value of boolean variables: false
Value of character variables: C
Value of integer variables: 254
Value of double variables: 123.456

 Value of variables after the reassignment
Value of boolean variables: true
Value of character variables: P
Value of integer variables: 317
Value of double variables: 987.654
*/