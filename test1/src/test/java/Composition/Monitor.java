package Composition;

public class Monitor {
	
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}

	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;

	public void drawPixelAt(int x,int y,String color) {
		System.out.println("drawing pixel at "+x+" "+y+" "+color);
	}
}
