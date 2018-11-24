package test.test1;

import java.util.Scanner;

public class practice {//In this practice class will add method n number of methods and will call them
	public static void minAndMaxChallange()
	{
		int num;
		int max=0;
		int min=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");		
		while(sc.hasNextInt())
		{
			System.out.println("Enter Number");
			num=sc.nextInt();
			count++;
			
			if(count==1)
			{
				min=num;
				max=num;
			}
				
			
			if(num>max)
			{
				max=num;
			}
			if(num<min)
			{
				min=num;
			}
			
			if(sc.hasNextInt()==false)
			{
				break;
			}
		}
		System.out.println("min value = "+ min + "max value = "+ max);
		
		
	}

	public static void main(String[] args)
	{
		minAndMaxChallange();
	}
}
