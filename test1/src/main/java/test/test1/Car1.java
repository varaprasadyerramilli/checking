package test.test1;

public class Car1 {

	private boolean engine;
	private int numberofcylinders;
	private int numberofwheels;
	private String carname;
	public Car1(int numberofcylinders,String carname)
	{
		System.out.println("Initiated constructor from Car1 class");
		this.engine = true;
		this.numberofcylinders = numberofcylinders;
		this.numberofwheels = 4;
		this.carname = carname;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getNumberofcylinders() {
		return numberofcylinders;
	}
	public int getNumberofwheels() {
		return numberofwheels;
	}
	public String getCarname() {
		return carname;
	}
	
	
	public void startEngine(String engineonoroff)
	{
		if(engineonoroff.equals("ON"))
		{
			System.out.println("Car engine is on from Car1 class");
		}
		else
		{
			System.out.println("Car engine is off from Car1 class");
		}
	}
	
	public void accelaration(int speed)
	{
		System.out.println("The car is accelarating at "+speed+" km/hr from Car1 class");
	}
	
	public void brake(boolean flag)
	{
		if(flag)
		{
			System.out.println("The car is stopping right now from Car1 class");
		}
		else
		{
			System.out.println("The car is not stopping right now from Car1 class");
		}
	}
	
	
	public static void main(String[] args)
	{
		Car1 c=new Car1(2,"figo");
		System.out.println(c.getCarname());
		System.out.println(c.getClass());
		System.out.println(c.getNumberofcylinders());
		System.out.println(c.getNumberofwheels());
		
		c.startEngine("ON");
		c.accelaration(150);
		c.brake(false);
	}
}

