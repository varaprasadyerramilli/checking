package test.test1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args)
	{
		LinkedList<String> placestovisit= new LinkedList<String>();
		placestovisit.add("Sydeny");
		placestovisit.add("Melborne");
		placestovisit.add("Brisbane");
		placestovisit.add("Perth");
		placestovisit.add("Canberra");
		placestovisit.add("Adelaide");
		placestovisit.add("Darwin");
		
		printList(placestovisit);
		
		placestovisit.add(1,"Alice Springs");
		printList(placestovisit);
		
		placestovisit.remove(4);
		printList(placestovisit);
	}

	private static void printList(LinkedList<String> LinkedList) {
		// TODO Auto-generated method stub
		Iterator<String> i= LinkedList.iterator();
		while(i.hasNext())
		{
			System.out.println("Now visiting " +i.next());
		}
		System.out.println("======================");
	}
}
