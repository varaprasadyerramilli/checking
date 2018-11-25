package test.test1;

/** This is an example program demonstrating encapsulation. So how this program became an example of demonstrating encapsulation are described as points below
->The variables tonnerlevel, numberofpagesprinted, duplexprinter are declared as private which means they cannot be accessed outside this class. They can be only accessed if there is
any public method present. So in this way no other class can override the fields present in this class this is one of the benefit of using encapsulation.

->We can use the methods declared in the below class outside this class and obtain the same results as this class. Which means we  donot know how the variables are declared and code
is written we just use the methods of this class by creating the objects and obtain results which is one of the benefit of using encapsulation.
*/
public class Encapsulationprinter {
	
	public Encapsulationprinter(int tonnerlevel, boolean duplexprinter) {
		if(tonnerlevel>0 && tonnerlevel<=100)
		{
			this.tonnerlevel = tonnerlevel;
		}
		else
		{
			System.out.println("Tonner level is not within the range");
		}
		
		this.numberofpagesprinted = 0;
		this.duplexprinter = duplexprinter;
	}
	
	private int tonnerlevel;
	private double numberofpagesprinted;
	private boolean duplexprinter;
	
	public int getTonnerlevel() {
		return tonnerlevel;
	}
	
	public double getNumberofpagesprinted() {
		return numberofpagesprinted;
	}
	
	public boolean isDuplexprinter() {
		return duplexprinter;
	}
	
	public double printpages(int pages)
	{
	if(pages>=0 && this.duplexprinter)
	{
		return numberofpagesprinted= (numberofpagesprinted+pages/2+pages%2);
	}
	else if(pages>=0 && this.duplexprinter==false)
	{
		return numberofpagesprinted+=pages;
	}
	else
	{
		return -1;
	}
	}
	
	public int addTonner(double toneramount)
	{
	if(toneramount>=0 && toneramount<=100)
	{
		if(this.tonnerlevel+toneramount<=100)
		{
			return this.tonnerlevel+=toneramount;
		}
		else
		{
			return this.tonnerlevel=-1;
		}
	}
	else
	{
		return this.tonnerlevel=-1;
	}
		
	}
	public static void main(String[] args)
	{
		Encapsulationprinter obj=new Encapsulationprinter(150, true);
		obj.addTonner(20);
		obj.printpages(5);
		System.out.println(obj.getTonnerlevel()+" "+obj.getNumberofpagesprinted());
		
	}
		

}

