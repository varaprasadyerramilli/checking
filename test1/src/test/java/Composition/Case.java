package Composition;

public class Case {

	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getPowersupply() {
		return powersupply;
	}
	public Dimensions getDimensions() {
		return dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
	public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.powersupply = powersupply;
		this.dimensions = dimensions;
	}
	private String model;
	private String manufacturer;
	private String powersupply;
	private Dimensions dimensions;
	
}
