package arraylist.mobilephone.challange;

import java.util.ArrayList;

public class contacts {
	private static ArrayList<String> contacts= new ArrayList<>();
	 	
	public void addContact(String contactname, long contactnumber){
		contacts.add(contactname+" "+Long.toString(contactnumber));			
	}
	
	public void printContacts(){
		for(int i=0; i<contacts.size(); i++){
			System.out.println(contacts.get(i));
		}
	}
	
	private static int getposition(String contactname, long contactnumber){
		return  contacts.indexOf(contactname+" "+contactnumber);
	}
	
	public void modifyContactName(String oldcontactname, long oldcontactnumber, String newContactName, long newContactNumber){
		int position=0;
		if(contacts.contains(oldcontactname+" "+oldcontactnumber)){
			position=getposition(oldcontactname,oldcontactnumber);
			contacts.remove(oldcontactname+" "+oldcontactnumber);
			contacts.add(position, newContactName+" "+newContactNumber);
		}
		else{
			System.out.println("Contact not found to update");
		}
	}

	 public void removeContacts(String contactname, long contactnumber){
			if(contacts.contains(contactname+" "+contactnumber)){
				contacts.remove(contactname+" "+contactnumber);
	 }
			else{
				System.out.println("Contact not found to remove");
			}
	 }
	
	 public void findContact(String contactname, long contactnumber){
		 if(contacts.contains(contactname+" "+contactnumber)){
				System.out.println("contact found");
		 }
				else{
					System.out.println("Contact not found");
				}
		
	}
}

