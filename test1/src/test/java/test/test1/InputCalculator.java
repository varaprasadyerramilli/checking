package test.test1;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage()
	 {
	     int SUM=0;
	     long AVG=0,COUNT=0;
	     Scanner sc= new Scanner(System.in);
	     while(sc.hasNextInt())
	     {
	         SUM+=sc.nextInt();
	         COUNT++;
	         
	         AVG=Math.round(SUM/COUNT);
	     }
	     if(!sc.hasNextInt())
	     {
	         System.out.println("SUM = "+SUM+" AVG = "+AVG);
	         
	     }
	 }
	 public static void main(String args[])
	 {
	     inputThenPrintSumAndAverage();
	 }
	 

}
