package test.test1;

public class Vipcustomer {
String name;
double creditlimit;
String emailaddress;
//created getters to print and see the result
public String getName() {
	return this.name;
}
public double getCreditlimit() {
	return this.creditlimit;
}
public String getEmailaddress() {
	return this.emailaddress;
}

//Creating Constructor to input the values

public Vipcustomer()
{
	this("vara",1235.00,"vara@gmail.com");
	System.out.println("1st constructor is called");
}
public Vipcustomer(String name, double creditlimit)
{
	
	
	this(name, creditlimit, "prasad@gmail.com");
	this.name=name;
	this.creditlimit=creditlimit;
	System.out.println("second constructor is called");
	
		
}
public Vipcustomer(String name, double creditlimit, String emailaddress)
{
	System.out.println("Third Constructor is called");
	this.name=name;
	this.creditlimit=creditlimit;
	this.emailaddress=emailaddress;
}
public static void main(String[] args)
{
	Vipcustomer obj=new Vipcustomer();
	System.out.println(obj.getCreditlimit()+ " "+obj.getEmailaddress()+" "+obj.getName());
	Vipcustomer obj1=new Vipcustomer("prakash",500.10);
	System.out.println(obj1.getCreditlimit()+ " "+obj1.getEmailaddress()+" "+obj1.getName());
	Vipcustomer obj2=new Vipcustomer("alekhya", 458585.12345,"alekhya@gmail.com" );
	System.out.println(obj2.getCreditlimit()+ " "+obj2.getEmailaddress()+" "+obj2.getName());
}
}
