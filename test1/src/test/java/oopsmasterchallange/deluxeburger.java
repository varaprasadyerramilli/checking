package oopsmasterchallange;

public class deluxeburger extends basehamburger {
	

	public deluxeburger() {
		super("Verticalandhorizantalbreadrolltype", "FishandPork", 170);
		// TODO Auto-generated constructor stub
		super.setAdditions1PriceAndName("Chips", 50);
		super.setAdditions2PriceAndName("Drinks", 50);	
	}

	@Override
	public void setAdditions1PriceAndName(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add this addtion to the burger");
	}

	@Override
	public void setAdditions2PriceAndName(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add this addtion to the burger");
	}

	@Override
	public void setAdditions3PriceAndName(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add this addtion to the burger");
	}

	@Override
	public void setAdditions4PriceAndName(String name, int price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add this addtion to the burger");
	}

}
