package test.test1;

import java.util.Arrays;
import java.util.Scanner;

public class Twodimensionalarray {

	public static void main(String[] args)
	{
		int[][] arr= new int[3][3];
		int[]arr1=new int[]{1,2,3};
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter "+i+" row");
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.toString(arr1));
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
