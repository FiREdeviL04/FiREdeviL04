/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to create the class. Create 2-3 objects of the class using new operator. Display the hashcode of all the objects. Then nullify the object one by one and call the garbage collector in between. At last display the hashcode of all the object again.
Program number: 021
*/

class Test021
{
    public static void main(String[] args)
    {
        Test021 obj1 = new Test021();
        Test021 obj2 = new Test021();
        Test021 obj3 = new Test021();
        System.out.println("Hashcode of object obj1: " + obj1);
        System.out.println("Hashcode of object obj1: " + obj2);
        System.out.println("Hashcode of object obj1: " + obj3);
        obj1 = null;
        System.gc();
        obj2 = null;
        Runtime.getRuntime().gc();
        System.gc();
        obj3 = null;
        System.out.println("\n Hashcode of object obj1: " + obj1);
        System.out.println("Hashcode of object obj2: " + obj2);
        System.out.println("Hashcode of object obj3: " + obj3);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("\n Garbage collector called");
        System.out.println("Object garbage collector : " + this);
    }
}

/*
Output

Hashcode of object obj1: Test021@8807e25
Hashcode of object obj1: Test021@3ada9e37
Hashcode of object obj1: Test021@5cbc508c

Garbage collector called

Hashcode of object obj1: null
Object garbage collector : Test021@8807e25

Garbage collector called
Object garbage collector : Test021@3ada9e37
Hashcode of object obj2: null
Hashcode of object obj3: null
*/