/*
Aim computer academy 
Program : write a program to declare object of various numeric wrapper classes . create constructor of each wrapper
class and assign string to them and display their values . 
program no : 015
*/

class Test015
{
	public static void main(String[] args)
	{
		String str1 = "51";
		String str2 = "317";
		Byte byteObj = new Byte(str1);
		Short shortObj = new short(str2);
		Integer intObj = new Integer("99");
		Long longObj = new Long("123456");
		Float floatObj = new Float("31.7");
		Double doubleObj  = new Double("56.54");
		System.out.println("Value of Byte wrapper class object: "+byteObj);
		System.out.println("Value of short wrapper class object: "+shortObj)
		System.out.println("Value of short wrapper class object: "+intObj)
		System.out.println("Value of short wrapper class object: "+longObj)
		System.out.println("Value of short wrapper class object: "+floatObj)
		System.out.println("Value of short wrapper class object: "+doubleObj)
	}
}