package test.test1;

import java.util.Scanner;

public class Minimumelementchallange {
	private Scanner sc=new Scanner(System.in);
	public int[] readIntegers(int count)
	{
		int[] arr=new int[count];
		System.out.println("Enter " +count+" numbers");
		for(int i=0; i<count; i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public int findMin(int[] arr)
	{
	int[] temp = new int[1];	
	int min=0,max=0;
	for(int j=0; j<arr.length; j++)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]<arr[i+1])
			{
				temp[0]=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp[0];
			}
		}		
	}
	max=arr[0];
	min=arr[arr.length-1];
	return min;
		
	}
	public static void main(String[] args)
	{
		Minimumelementchallange m = new Minimumelementchallange();		
		System.out.println("Min value is " +m.findMin(m.readIntegers(5)));
	}
}
