/*
AIM Computer Academy
Program: Write a program to declare one instance variable (class level scope variable). Declare one or two methods and try to access that variable from all the methods.
Program number: 012
*/

class Test012
{
    public static void main(String[] args)
    {
        int num1 = 25;
        Test012 obj = new Test012();
        System.out.println("Value of num1 inside main() method: " + num1);
        obj.method1();
        obj.method2();
    }
    public static void method1()
    {
        int intVar1 = 31;
        System.out.println("Value of intVar1 inside method1(): " + intVar1);
        // System.out.println("Value of intVar2 inside method1(): " + num1); // Line-1
    }
    public static void method2()
    {
        int intVar2 = 18;
        System.out.println("Value of intVar2 inside method2(): " + intVar2);
        // System.out.println("Value of intVar1 inside method2(): " + num1); // Line-2
    }
}

/*
Output

Value of num1 inside main() method: 25
Value of intVar1 inside method1(): 31
Value of intVar2 inside method2(): 18
*/