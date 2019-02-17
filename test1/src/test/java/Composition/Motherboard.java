package Composition;

public class Motherboard {
	
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getRamslots() {
		return ramslots;
	}
	public int getCarslots() {
		return carslots;
	}
	public String getBios() {
		return bios;
	}
	
	public void loadProgram(String programname) {
		System.out.println("Loading program "+programname);
	}
	public Motherboard(String model, String manufacturer, int ramslots, int carslots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramslots = ramslots;
		this.carslots = carslots;
		this.bios = bios;
	}
	private String model;
	private String manufacturer;
	private int ramslots;
	private int carslots;
	private String bios;

}
