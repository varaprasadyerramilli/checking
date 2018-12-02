package test.test1;

public class Fordfigo extends Car1{

	public Fordfigo(int numberofcylinders, String carname) {
		super(numberofcylinders, carname);
		System.out.println("Initiated the constructor from Fordfigo class");		
	}
	public void accelaration(int speed)
	{
		System.out.println("This cars accelartion is o - 100km/hr in 3 seconds "+ "and top speed is " +speed);
		super.accelaration(100);
	}
	public static void main(String[] args)
	{
		Fordfigo f=new Fordfigo(3,"fordfigo");
		System.out.println(f.getCarname());
		System.out.println(f.getNumberofcylinders());
		System.out.println(f.getClass());
		System.out.println(f.getNumberofwheels());
		f.accelaration(250);
		
	}
	

}
