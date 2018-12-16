package test.test1;

import java.util.ArrayList;

public class Mobilephone {

	private static ArrayList<String> contacts = new ArrayList<String>();
	
	
public static void Storecontacts(String name)
{
	contacts.add(name);
}
	

public static int getIndexOfContact(String name)
{
	int index =0;
	for(int i=0; i<contacts.size(); i++)
	{
		if(contacts.contains(name))
		{
			index=i;
		}
		else
		{
			index=-1;
		}	
	}
	return index;
}

public static void modifyContacts(String name, String name1)
{
	int index=getIndexOfContact(name);
	if(index>=0)
	{
	contacts.remove(index);
	contacts.add(index, name1);
	}
	else
	{
		System.out.println("The item which you need to modify is not present in contacts");
	}
	
}

public static void quit()
{
	System.exit(0);
}

public static void printListOfContacts()
{
	for(int i=0; i<contacts.size(); i++)
	{
		System.out.println(contacts.get(i));
	}
}

public static void addNewContact(String name)
{
	if(contacts.contains(name))
	{
		System.out.println("The contacts already exists in the system");
	}
	else
	Storecontacts(name);
}

public static void updateExistingContact(String name, String name1)
{
	if(contacts.contains(name))
	{
	modifyContacts(name,name1);
	}
	else
		System.out.println("The contact which you are trying to modify does not exits");
}
public static void removeContact(String name)
{
	contacts.remove(getIndexOfContact(name));
}

public static void main(String[] args)
{
	addNewContact("Sai");
	addNewContact("Alekhya");
}



		}
