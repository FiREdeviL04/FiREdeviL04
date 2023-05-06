/*
AIM Computer Academy
program : Write a program to object of integer wrapper class and assign 
the string value to it , which cannot be converted into number. Observe
the behavior.
program number : 016
*/

class Test016
{
	public static void main(String [] args)
	{
		Integer intObj = new Integer("ten");
		System.out.println("Value of Integer wrapper class object:"+ intObj);
	}
}