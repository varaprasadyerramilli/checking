package test.test1;

public class Car extends Baseclassvehicle {
	
public String getCarname() {
		return this.carname;
	}

	public int getCarwarrenty() {
		return this.carwarrenty;
	}

private String carname;
private int carwarrenty;

	public Car(int changinggears, int movingspeed, String carname, int carwarrenty) {
		super(changinggears, movingspeed);
		/**
		 The keyword super is commonly used with method overriding, when we call a method with the same name from the parent class. Below are some of the important points of the
		 constructor
		 
		  ->use this() to call a constructor from another overloaded constructor in the same class/ use super() to call a parent constructor 
		  
		  ->The call to this() can only be used in a constructor, and its must be the first statement in the constructor. It's used with the constructor chaining, in other words one 
		  constructor calls another constructor  and helps to reduce duplicated code
		  
		  NOTE: A constructor can have a call to super() or this() but never both
		
		 */
		System.out.println("This is the constructor from the Car class");
		this.carname=carname;
		this.carwarrenty=carwarrenty;
	}
	
	public static void main(String[] args)
	{
		Car obj=new Car(6, 150, "Maruthi Alto", 5);
		System.out.println(obj.getSteering()+" "+obj.getMovingspeed()+" "+obj.getChanginggears()+" "+obj.getCarname()+" "+obj.getCarwarrenty());
		}
	
	
}
