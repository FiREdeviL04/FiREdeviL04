/*
AIM Computer academy
Program: Write a program to declare character variables and assign character variables literals to them in different formats.
Program No. : 004
*/

class Test004
{
	char ch1 = 'a';
	char ch2 = 65;
	char ch3 = 0100;
	char ch4 = 0x56;
	char ch5 = 0XFACE;
	char ch6 = '\u1234';
	char ch7 = '\\';
	public static void main(String[] args)
	{
		Test004 obj = new Test004();
		System.out.println("value of first character literals variable:" + obj.ch1);
		System.out.println("value of second character literals variable using decimal form:" + obj.ch2);
		System.out.println("value of third character literals variable using octal form :" + obj.ch3);
		System.out.println("value of fourth character literals variable using hexadecimal form :" + obj.ch4);
		System.out.println("value of fifth character literals variable using hexadecimal form :" + obj.ch5);
		System.out.println("value of sixth character literals variable using 'uxxxx' form:" + obj.ch6);
		System.out.println("value of seventh character literals variable using escape sequence character:" + obj.ch7);
	}
}

/*
Output
---------
value of first character literals variable:a
value of second character literals variable using decimal form:A
value of third character literals variable using octal form :@
value of fourth character literals variable using hexadecimal form :V
value of fifth character literals variable using hexadecimal form :?
value of sixth character literals variable using 'uxxxx' form:?
value of seventh character literals variable using escape sequence character:\
*/
