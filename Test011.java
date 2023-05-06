/*
AIM Computer Academy
Program : Write a program to declare one instance variable (class level scope variable).
Declare one or two methods and try access that variable from all the methods.
Program number : 011
*/

class Test011
{
	int num = 25;
	public static void(String[] args)
	{
		Test011 obj1 = new Test011();
		System.out.println("Value of num from main() method:" + obj1.num);
		obj1.method1();
		obj1.method2();
	}
	public void method1()
	{
		Test011 obj2 = new Test011();
		obj2.num = 31;
		System.out.println("Value of num from method1() method:" + obj2.num);
	}
	public void method2()
	{
		Test011 obj3 = new Test011();
		obj3.num = 10;
		System.out.println("Value of num from method2() method: " + obj2.num);
	}
}