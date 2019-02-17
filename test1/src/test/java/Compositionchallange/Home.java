package Compositionchallange;

public class Home {

	private Hall Hall;
	private Kitchen Kitchen;
	private interior Interior;
	public Home(Hall theHall, Kitchen theKitchen, interior theInterior) {
		super();
		this.Hall = theHall;
		this.Kitchen = theKitchen;
		this.Interior = theInterior;
	}
	public Hall getTheHall() {
		return Hall;
	}
	public Kitchen getTheKitchen() {
		return Kitchen;
	}
	public interior getTheInterior() {
		return Interior;
	}
	
}
