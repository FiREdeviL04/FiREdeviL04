/*
AIM  Computer Academy
Program : wtite a program to declare variable of all primitive of Java. Display the default
value of each variable.
Program number: 001
*/

class Test001
{
	byte byteVar;
	short shortVar;
	int intVar;
	long longVar;
	float floatVar;
	double doubleVar;
	boolean booleanVar;
	char charVar;
	public static void main(String[] args)
	{
		Test001 obj = new Test001();
		System.out.println("Default value of byte variable: " + obj.byteVar);
		System.out.println("Default value of byte variable: " + obj.shortVar);
		System.out.println("Default value of byte variable: " + obj.intVar);
		System.out.println("Default value of byte variable: " + obj.longVar);
		System.out.println("Default value of byte variable: " + obj.floatVar);
		System.out.println("Default value of byte variable: " + obj.doubleVar);
		System.out.println("Default value of byte variable: " + obj.booleanVar);
		System.out.println("Default value of byte variable: " + obj.charVar);
	}
}

/*
Output
---------
Default value of byte variable: 0
Default value of byte variable: 0
Default value of byte variable: 0
Default value of byte variable: 0
Default value of byte variable: 0.0
Default value of byte variable: 0.0
Default value of byte variable: false
Default value of byte variable:
*/
