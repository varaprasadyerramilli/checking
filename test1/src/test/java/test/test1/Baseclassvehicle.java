package test.test1;

public class Baseclassvehicle {
private int steering;
private int changinggears;
private int movingspeed;

public Baseclassvehicle(int changinggears, int movingspeed)
{
	System.out.println("This is the constructor from the basevehicle class");
	this.steering=1;
	this.changinggears=changinggears;
	this.movingspeed=movingspeed;
}


public int getSteering() {
	return this.steering;
}
public int getChanginggears() {
	return this.changinggears;
}
public int getMovingspeed() {
	return this.movingspeed;
}
public static void main(String[] args)
{
	Baseclassvehicle obj= new Baseclassvehicle(5,100);
	System.out.println(obj.getSteering()+" "+obj.getMovingspeed()+" "+obj.getChanginggears());
}
}
