package Composition;

public class Main {
	
	
	public static void main(String[] args){
		Dimensions dim=new Dimensions(10,20,30);
		Case theCase=new Case("dell","dell+","GreatePowerSupply",dim);
		Motherboard theMotherboard=new Motherboard("Lenova","Dell",2,3,"bootcampbios");
		Monitor theMonitor=new Monitor("30inchbeast","Acer",27, new Resolution(10,10));
		
		PC thePC=new PC(theCase, theMonitor, theMotherboard);
		thePC.getMonitor().drawPixelAt(1, 2, "Blue");
		thePC.getMotherboard().loadProgram("Windows 10");
		thePC.getTheCase().pressPowerButton();
	}

}
