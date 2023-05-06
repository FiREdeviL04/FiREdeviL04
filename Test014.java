/*
AIM Computer Academy
Course: Diploma in Information Technology
Semester: 4
Program: Write a program to declare object of various numeric wrapper classes. Create constructor of each class and assign some value to them and display their values.
Program number: 014
*/

class Test014
{
    public static void main(String[] args)
    {
        byte byteVar = 25;
        short shortVar = 31789;
        Byte byteObj = new Byte(byteVar);
        Short shortObj = new Short(shortVar);
        Integer intObj = new Integer(10000);
        Long longObj = new Long(179);
        Float floatObj = new Float(23.4);
        Double doubleObj = new Double(99.88);
        System.out.println("Value of Byte wrapper class object: " + byteObj);
        System.out.println("Value of Short wrapper class object: " + shortObj);
        System.out.println("Value of Integer wrapper class object: " + intObj);
        System.out.println("Value of Long wrapper class object: " + longObj);
        System.out.println("Value of Float wrapper class object: " + floatObj);
        System.out.println("Value of Double wrapper class object: " + doubleObj);
    }
}

/*
Output

Value of Byte wrapper class object: 25
Value of Short wrapper class object: 31789
Value of Integer wrapper class object: 10000
Value of Long wrapper class object: 179
Value of Float wrapper class object: 23.4
Value of Double wrapper class object: 99.88
*/