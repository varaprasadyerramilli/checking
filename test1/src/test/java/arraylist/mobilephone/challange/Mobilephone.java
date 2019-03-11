package arraylist.mobilephone.challange;

import java.util.Scanner;

public class Mobilephone {
	private static contacts c=new contacts();
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args){
		boolean exit =false;		
		while(!exit){
			System.out.println("Enter your choice & if you want to see menu please enter 0:");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
			case 0: printMenu();
			break;
			case 1: printingListOfContacts();
			break;
			case 2: addingNewContact();
			break;
			case 3: updatingExistingContact();
			break;
			case 4: removeContact();
			break;
			case 5: findContact();
			break;
			case 6: exit=true;
			break;
			}
		}
		
	}
	
	 public static void printMenu(){
		System.out.println("Choice1 will print list of all the contacts \n"
				+ "Choice2 will add the contact to the existing list \n"
				+ "Choice3 will update the existing contact \n"
				+ "Choice4 will  remove the existing contact \n"
				+ "choice5 will find the existing contact \n"
				+ "choice6 is exit");
		
	}
	 
	 public static void printingListOfContacts(){
		 System.out.println("Below are the list of contacts available");
		 c.printContacts();		 
	 }
	 
	 public static void addingNewContact(){
		 System.out.println("Enter the contact name and contactnumber which you wanted to add");
		 String contactname=sc.nextLine();
		 long contactnumber=sc.nextLong();
		 sc.nextLine();		 
		 c.addContact(contactname, contactnumber);
	 }
	 
	 public static void updatingExistingContact(){
		 System.out.println("Enter old contactname");
		 String oldcontactname=sc.nextLine();
		 System.out.println("Enter old contactnumber");
		 long oldcontactnumber=sc.nextLong();
		 sc.nextLine();
		 System.out.println("Enter new contactname");
		 String newcontactname=sc.nextLine();
		 System.out.println("Enter new contactnumber");
		 long newcontactnumber=sc.nextLong();
		 sc.nextLine();
		 c.modifyContactName(oldcontactname, oldcontactnumber, newcontactname, newcontactnumber);
	 }
	 
	 public static void removeContact(){
		 System.out.println("Enter the contactname/number which you wanted to remove");
		 String contactname=sc.nextLine();
		 long conactnumber=sc.nextLong();
		 sc.nextLine();
		 c.removeContacts(contactname, conactnumber);
	 }
	 
	 public static void findContact(){
		 System.out.println("Enter the contact number/name which you wanted to found");
		 String contactname=sc.nextLine();
		 long contactnumber=sc.nextLong();
		 sc.nextLine();
		 c.findContact(contactname, contactnumber);
	 }
}
