package Compositionchallange;

public class Main {
	
	public static void main(String[] args) {
		Hall theHall=new Hall(10,20,20,"Blue");
		Kitchen theKitechen=new Kitchen(10,20,30,true,true);
		interior theInterior=new interior(true, "SaiInteriors");
		Home theHome=new Home(theHall,theKitechen,theInterior);
		theHome.getTheHall().entered();
		theHome.getTheInterior().interiorSpecifications();
		theHome.getTheKitchen().kitchenSpecifications();
		
		
	}

	
	
}
