package Compositionchallange;

public class interior {
	
	private boolean wooden;
	private String interiordesigner;
	public interior(boolean wooden, String interiordesigner) {
		super();
		this.wooden = wooden;
		this.interiordesigner = interiordesigner;
	}
	public boolean isWooden() {
		return wooden;
	}
	public String getInteriordesigner() {
		return interiordesigner;
	}
	public void interiorSpecifications() {
		System.out.println("Is the interior is wooden "+wooden+" designed by "+interiordesigner);
	}
	

}
