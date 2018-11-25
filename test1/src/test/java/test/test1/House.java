package test.test1;

/** Keep in mind that in java you always have references to an object in memory, there is no way to access an object directly everything is done using a reference
 */

public class House {

	private String color;
	
	public House(String color)
	{
		this.color=color;// we are using this keyword here as there is another color field as the instance of field
	}
	
	
	public String getcolor()
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color=color;
	}
	
	
	public static void main(String[] args)
	{
		House blueHouse= new House("blue");//This creates a new instance of house class
		House anotherHouse= blueHouse;
		
		System.out.println(blueHouse.getcolor());
		System.out.println(anotherHouse.getcolor());
		
		anotherHouse.setcolor("yellow");
		System.out.println(blueHouse.getcolor());
		System.out.println(anotherHouse.getcolor());
		
		House greenHouse= new House("Green");
		anotherHouse= greenHouse;
		System.out.println(blueHouse.getcolor());
		System.out.println(greenHouse.getcolor());
		System.out.println(anotherHouse.getcolor());
		
	}
}
