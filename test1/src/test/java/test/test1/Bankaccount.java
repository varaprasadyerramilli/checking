package test.test1;

public class Bankaccount {
	
	private int accountnumber;
	private int balance;
	private String customername;
	private String email;
	private int phonenumber;
	
	public void setaccountnumber(int accountnumber)
	{
	 this.accountnumber=accountnumber;	
   	}
	
	public int getaccountnumber()
	{
		return this.accountnumber;
	}
	
	public void balance(int balance)
	{
		this.balance=balance;
	}
	public int getbalance()
	{
		return this.balance;
	}
	
	public void customername(String customername)
	{
	this.customername=customername;	
	}
	public String getcustomername()
	{
		return this.customername;
	}
	public void email(String email)
	{
		this.email=email;
	}
	public String getemail()
	{
		return this.email;
				
	}
	public void phonenumber(int phonenumber)
	{
		this.phonenumber=phonenumber;
	}
	public int getphonenumber()
	{
		return this.getphonenumber();
	}
	public void depositfunds(int funds)
	{
		System.out.println(balance+=funds);
	}
	public void withdrawfunds(int funds)
	{
		System.out.println(balance-=funds);
	}
public static void main(String[] args)
{
	Bankaccount obj=new Bankaccount();
	obj.depositfunds(1000);
	obj.withdrawfunds(100);
	obj.withdrawfunds(2);
}
}
