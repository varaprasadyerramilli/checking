package test.test1;

public class Bankaccount {
	
	private int accountnumber;
	private int balance;
	private String customername;
	private String email;
	private int phonenumber;
	
	public Bankaccount()
	{
		this(12347, 500, "pussycat", "varaprasad@gmail.com", 770267336 );
		System.out.println("Default constructor called");
		
	}	
	public int getaccountnumber()
	{
		return this.accountnumber;
	}
	public int getbalance()
	{
		return this.balance;
	}
	public String getcustomername()
	{
		return this.customername;
	}
	public String getemail()
	{
		return this.email;
				
	}
	public int getphonenumber()
	{
		return this.phonenumber;
	}
	public void withdrawfunds(int funds)
	{
		if(balance-funds<0)
		{
			System.out.println("Insufficient funds");
		}
		else
		{
			System.out.println("Currently available balance after withdrawal "+(this.balance-=funds));
		}		
	}
	
	public void depositfunds(int funds)
	{
		System.out.println("Currently available balance after deposit "+(balance+=funds));
	}
	
	
	
	public Bankaccount(int accountnumber, int balance, String customername, 
			String email, int phonenumber)
	{
		System.out.println("parametarized constructor is called");
		this.accountnumber=accountnumber;
		this.balance=balance;
		this.customername=customername;
		this.email=email;
		this.phonenumber=phonenumber;
	}
public static void main(String[] args)
{
 
	Bankaccount obj1=new Bankaccount(1234567, 500, "Alekhya", "varaprasad@gmail.com", 770267336 );
	System.out.println(obj1.getaccountnumber()+" "+obj1.getcustomername());
	   Bankaccount obj=new Bankaccount();
	    System.out.println(obj.getaccountnumber()+" "+obj.getcustomername());
	    System.out.println("-------");
	    
	   obj.depositfunds(1000);
	   obj.withdrawfunds(1500);
	    
}
}
