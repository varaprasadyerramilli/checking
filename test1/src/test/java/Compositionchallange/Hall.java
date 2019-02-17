package Compositionchallange;

public class Hall {
	
	private int size;
	private int height;
	private int width;
	private String color;
	public Hall(int size, int height, int width, String color) {
		super();
		this.size = size;
		this.height = height;
		this.width = width;
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}
	public void entered() {
		System.out.println("Entered into the hall which has "+size+" size "+height+" height "+width+" width "+color+" Color ");
	}
	
	

}
