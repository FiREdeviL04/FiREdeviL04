/*
AIM Computer Academy
Program : Write a program to declare different integer variables and assign integral literals to
them in different formats.
Program number : 002
*/

class Test002
{
		int num1 = 254;		// Decimal literal
		int num2 = 0100;		// Octal literal
		int num3 = 0xface;		// Hexa-decimal literal
		int num4 = 0XFACE;		// Hexa-decimal literal
		int num5 = 0b1101;		// Binary literal
		int num6 = 0B1111;		// Binary literal
		public static void main(String[] args)
		{
			Test002 obj = new Test002();
			System.out.println("Value of decimal literal's variable: " + obj.num1);
			System.out.println("Value of octal literal's variable: " + obj.num2);
			System.out.println("Value of hexa-decimal literal's variable: " + obj.num3);
			System.out.println("Value of hexa-decimal literal's variable: " + obj.num4);
			System.out.println("Value of binary literal's variable: " + obj.num5);
			System.out.println("Value of binary literal's variable: " + obj.num6);
		}
}


/*
Output
---------
Value of decimal literal's variable: 254
Value of octal literal's variable: 64
Value of hexa-decimal literal's variable: 64206
Value of hexa-decimal literal's variable: 64206
Value of binary literal's variable: 13
Value of binary literal's variable: 15
*/