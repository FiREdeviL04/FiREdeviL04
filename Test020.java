/*
AIM Computer Academy
Program: Write a program to create some objects of Boolean wrapper class. Create some objects using constructors and some using booleanValue method. Display the value of all the objects.
Program number: 020
*/

class Test020
{
    public static void main(String[] args)
    {
        Boolean booleanObj1 = new Boolean("true");
        Boolean booleanObj2 = new Boolean("TruE");
        Boolean booleanObj3 = new Boolean("FALSE");
        Boolean booleanObj4 = new Boolean("Angel");
        boolean booleanVar1 = booleanObj1.booleanValue();
        boolean booleanVar2 = booleanObj2.booleanValue();
        boolean booleanVar3 = booleanObj3.booleanValue();
        boolean booleanVar4 = booleanObj4.booleanValue();
        System.out.println("Value of first boolean object which is instantiate using constructor: " + booleanObj1);
        System.out.println("Value of second boolean object which is instantiate using constructor: " + booleanObj2);
        System.out.println("Value of third boolean object which is instantiate using constructor: " + booleanObj3);
        System.out.println("Value of fourth boolean object which is instantiate using constructor: " + booleanObj4);
        System.out.println("Value of first boolean variable which is assigned using booleanValue method: " + booleanVar1);
        System.out.println("Value of second boolean variable which is assigned using booleanValue method: " + booleanVar2);
        System.out.println("Value of third boolean variable which is assigned using booleanValue method: " + booleanVar3);
        System.out.println("Value of fourth boolean variable which is assigned using booleanValue method: " + booleanVar4);
    }
}