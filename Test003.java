/*
AIM Computer academy
Program: Write a program to declare float and double variables and assign floating point literals to them in different formats
Program No. : 003
*/

class Test003
{
	float floatNum1 = 25.4f;
	float floatNum2 = 317.179F;
	float floatNum3 = 1.23e2f;
	float floatNum4 = 1.789e-3F;
	double doubleNum1 = 123.456;
	double doubleNum2 = 789.456d;
	double doubleNum3 = 9.8e3;
	double doubleNum4 = 987.654e-2;
	public static void main(String[] args)
	{
		Test003 obj = new Test003();
		System.out.println("Value of first floating point literals variable:" + obj.floatNum1);
		System.out.println("Value of second floating point literals variable:" + obj.floatNum2);
		System.out.println("Value of third floating point literals variable:" + obj.floatNum3);
		System.out.println("Value of fourth floating point literals variable:" + obj.floatNum4);
		System.out.println("Value of first double point literals variable:" + obj.doubleNum1);
		System.out.println("Value of second double point literals variable:" + obj.doubleNum2);
		System.out.println("Value of third double point literals variable:" + obj.doubleNum3);
		System.out.println("Value of fourth double point literals variable:" + obj.doubleNum4);
	}
}

/*
Output
---------
Value of first floating point literals variable:25.4
Value of second floating point literals variable:317.179
Value of third floating point literals variable:123.0
Value of fourth floating point literals variable:0.001789
Value of first double point literals variable:123.456
Value of second double point literals variable:789.456
Value of third double point literals variable:9800.0
Value of fourth double point literals variable:9.87654
*/