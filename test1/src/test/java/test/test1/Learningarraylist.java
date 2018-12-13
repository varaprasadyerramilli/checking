package test.test1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Learningarraylist {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter n value");
	        int n = input.nextInt();
	        
	        // Store the 2-d array
	        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
	        for (int row = 0; row < n; row++)
	        {
	        	System.out.println("Enter d value");
	        	int d = input.nextInt();	            
	            ArrayList<Integer> list = new ArrayList<>();
	            for (int col = 0; col < d; col++) {
	                list.add(input.nextInt());
	            }
	            lists.add(list);            
	        }
	        System.out.println(lists.toString());
	        System.out.println(lists.size());
	        System.out.println(lists.get(0).get(4));
	        System.out.println(lists.get(1).get(0));
	        System.out.println(lists.get(2).get(2));
	        System.out.println(lists.get(3));
	        System.out.println(lists.get(4).get(1));
	        // Work out the queries
	        int q = input.nextInt();
	        for (int i = 0; i < q; i++) {
	            int x = input.nextInt();
	            int y = input.nextInt();
	            ArrayList<Integer> list = lists.get(x-1);
	            
	            if (y <= list.size()) {
	                System.out.println(list.get(y-1));
	            } else {
	                System.out.println("ERROR!");
	            }
	        }
	        
	        input.close();
	        
	    }
}

