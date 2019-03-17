package practiselinkedlist;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListPractise {
	
	 private static LinkedList<String> citiesvisited=new LinkedList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addInOrder(citiesvisited, "Delhi");
addInOrder(citiesvisited, "Jammu");
addInOrder(citiesvisited, "Andrapradesh");
addInOrder(citiesvisited, "Vizag");
addInOrder(citiesvisited, "Hyderbad");
printLinkedList(citiesvisited);


	}
	
	
	public static void printLinkedList(LinkedList<String> citiesvisited){
		ListIterator<String> listiterator= citiesvisited.listIterator();
		while(listiterator.hasNext()){
			System.out.println(listiterator.next());
		}
		System.out.println("==============================");  
	}
	
	public static boolean addInOrder(LinkedList<String> citiesvisited, String newCity){
		ListIterator<String> li=citiesvisited.listIterator();		
		while(li.hasNext()){
			int comparison=li.next().compareTo(newCity);
			System.out.println("int value "+comparison);
			if(comparison==0){
				//equal do not add
				System.out.println(newCity+" is already in the desired position");
				return false;
			}
			else if(comparison>0){
				//new city should appear before the current city
				li.previous();
				li.add(newCity);
				return true;
			}
			else if(comparison<0){
				//move on next city				
			}
		}
         li.add(newCity);
		return true;
	}

	public static void print(LinkedList<String> citiesvisited){
		ListIterator<String> listiterator= citiesvisited.listIterator();
		System.out.println(listiterator.next());
		System.out.println(listiterator.next());
		System.out.println(listiterator.next());
		System.out.println(listiterator.previous());
		System.out.println(listiterator.previous());
		System.out.println(listiterator.previous());
		System.out.println("==============================");  
	}
	
	
}
