/*
AIM Computer academy
Program: Write a program to declare one integer and one double variables. Assign some value to integer variable. Then assign
that value to double variable and display the value of both the variables.
Program No. : 009
*/

class Test009
{
	public static void main(String[] args)
	{
		int intVar = 25;
		double doubleVar;
		doubleVar = intVar;
		System.out.println("value of integer variable:" + intVar);
		System.out.println("value of double variable:" + doubleVar);
	}
}

/*
Output
----------
value of integer variable:25
value of double variable:25.0
*/
