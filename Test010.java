/*
AIM Computer academy
Program: Write a program to declare one integer and one double variables. Assign some value to double variable. Then assign
that value to integer variable and display the value of both the variables.
Program No. : 010
*/

class Test010
{
	public static void main(String[] args)
	{
		int intVar;
		double doubleVar = 25.31;
		intVar = doubleVar;
		System.out.println("value of integer variable:" + intVar);
		System.out.println("value of double variable:" + doubleVar);
	}
}

		