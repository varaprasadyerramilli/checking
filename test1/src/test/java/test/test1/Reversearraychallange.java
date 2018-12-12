package test.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearraychallange {
private static Scanner sc= new Scanner(System.in);
	public static void reverse(int[] arr)
	{
		System.out.println("The reversed array is show below");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args)
	{
		int numbersOfElements;
		System.out.println("Enter how many elements in  the array");
		numbersOfElements=sc.nextInt();
		System.out.println("Enter the elements into the array");
		int[] arr= new int[numbersOfElements];
		for(int i=0; i<numbersOfElements; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The unreversed array is "+ Arrays.toString(arr));
		reverse(arr);		
	}
}
