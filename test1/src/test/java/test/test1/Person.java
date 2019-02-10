package test.test1;

public class Person {

	private String firstName,lastName;
	private int age;
	
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setFirstName(String name)
	{
		this.firstName=name;
	}
	public void setLastName(String name)
	{
		this.lastName=name;
	}
	public void setAge(int Age)
	{
		if(Age<0||Age>100)
		{
			this.age=0;
		}
		else
		{
			this.age=Age;
		}
	}
	public boolean isTeen()
	{
	 if(age>12 && age<20)	
	return true;
	 else
	return false;
	}
	
	public String getFullName()
	{
		if(firstName.isEmpty() && lastName.isEmpty())
		{
			return "";
		}
		else if(firstName.isEmpty())
		{
			return lastName;
		}
		else if(lastName.isEmpty())
		{
			return firstName;
		}
		else
		{
			return firstName+" "+lastName;
		}
		
	}
}
