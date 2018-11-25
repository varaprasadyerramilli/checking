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
