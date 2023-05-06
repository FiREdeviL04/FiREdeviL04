/*
Subject : JAVA
Course : IT
semester : 4
Program: Write a program to declare 2-3 array variables. Demonstrate how to instantiate an array. Also give different ways to initialize an array. Then display the contents of all array variables.
Program number: 090
*/

class Test090
{
    public static void main(String[] args)
    {
        int[] arr1 = new int[3];
        int []arr2 = new int[3];
        int arr3[] = new int[3];
        int[] arr4 = {10,20,30};
        int i = 0;
        arr1[0] = arr1[1] = arr1[2] = 99;
    
        arr2[0] = 25;
        arr2[1] = 4;

        arr3[0] = 89;
        arr3[1] = 98;
        arr3[2] = 99;

        System.out.print("Content of first array: ");
        for (i=0; i<3; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n Content of second array: ");
        for (i=0; i<2; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n Content of third array: ");
        for (i=0; i<3; i++)
        {
            System.out.print(arr3[i] + " ");
        }
        System.out.print("\n Content of fourth array: ");
        for (i=0; i<3; i++)
        {
            System.out.print(arr4[i] + " ");
        }
    }
}