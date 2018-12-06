package test.test1;

import java.util.Scanner;

public class Arraychallange {
	Scanner sc= new Scanner(System.in);
	
	public int[] getIntegers(int num)
	{
		int[] arr=new int[num];
		System.out.println("Enter integers upto " +num);
		for(int i=0; i<num; i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	public void printArray()
	{
		
		Arraychallange a = new Arraychallange();
		int arr[] = a.getIntegers(5);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public int[] sortedArray()
	{
		Arraychallange a = new Arraychallange();
		int arr[] = a.getIntegers(5);
		int[] temp= new int[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<arr[i+1])
			{
				temp[i]=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp[i];
			}
		}
		return arr;
		
	}
	

	public static void main(String[] args)
	{
		Arraychallange a1= new Arraychallange();
int[] arr=a1.sortedArray();
for(int i=0; i<arr.length; i++)
{
	System.out.println(arr[i]);
}

		
	}
}
