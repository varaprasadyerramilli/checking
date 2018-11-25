package test.test1;

public class Alto extends Car {
	
	private String carcolour;
	private int cartopseed;

	public String getCarcolour() {
		return this.carcolour;
	}

	public int getCartopseed() {
		return this.cartopseed;
	}

	public Alto(int changinggears, int movingspeed, String carname, int carwarrenty, String carcolur, int cartopspeed) {
		super(changinggears, movingspeed, carname, carwarrenty);
		System.out.println("This is the constructor from the alto class");
		this.carcolour=carcolur;
		this.cartopseed=cartopspeed;
		
	}
	
	public static void main(String[] args)
	{
		Alto obj= new Alto(7,200,"Alto", 10, "Blue", 300);
		System.out.println(obj.getSteering()+" "+obj.getChanginggears()+" "+obj.getMovingspeed()+" "+obj.getCarname()+" "+obj.getCarwarrenty()+" "+obj.getCarcolour()+" "+obj.getCartopseed());
	}

		
	}
