/*
AIM computer academy
Author : Vishal koshti
Program : Write a program to create a class. Create 2-3 objects of the class using new operator. Display the 
hash code of all the objects. Then nullify the objects one by one and call the garbage collector un between. At
last diaplay the hashcode of all the object again
program number : 018
*/

class Test021
{
	public static void main (String[] args) throws InterruptedException
	{
		Test021 obj1 = new Test021();
		Test021 obj2 = new Test021();
		Test021 obj3 = new Test021();
		System.out.println("Hashcode of object obj1: " + obj1);
		System.out.println("Hashcode of object obj2: " + obj2);
		System.out.println("Hashcode of object obj3: " + obj3);
		obj1 = null;
		System.gc();
		obj2 = null;
		Runtime.getRuntime().gc();
		System.gc();
		Obj3 = null;
		System.out.println("\n Hashcode of object obj1:" + obj1);
		System.out.println("\n Hashcode of object obj1:" + obj2);
		System.out.println("\n Hashcode of object obj1:" + obj3);
		
		
		