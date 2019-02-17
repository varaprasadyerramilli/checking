package Compositionchallange;

public class Kitchen {

	private int height;
	private int width;
	private int length;
	private boolean washbasin;
	private boolean woodwork;
	
	public Kitchen(int height, int width, int length, boolean washbasin, boolean woodwork) {
		super();
		this.height = height;
		this.width = width;
		this.length = length;
		this.washbasin = washbasin;
		this.woodwork = woodwork;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	public boolean isWashbasin() {
		return washbasin;
	}
	public boolean isWoodwork() {
		return woodwork;
	}
	
	public void kitchenSpecifications() {
		System.out.println("Kitchen specifications are as follows "+height+" height "+width+" width "+length+" length "+washbasin+" if the before text is true it has wash basin else no "
				+woodwork+" if the before text is true it has woodwork else no");
	}
	
	
	
}
