package Oppsmasterchallange;

public class Basichamburger {

	private String breadrolltype;
	private boolean meat;
	private int tomato;
	private int carrot;
	private int luccete;
	private int potato;
	private int price;
	private String burgername;
	
	public int additionaltomato() {
		return price+=15;
	}
	public int additionalCarrot() {
		return price+=20;
	}
	public int additionalluccete() {
		return price+=25;
	}
	public int additionalpotato() {
		return price+=30;
	}
	
	public Basichamburger(String breadrolltype, boolean meat, int price, String burgername) {
		this.breadrolltype = breadrolltype;
		this.meat = meat;
		this.price = price;
		this.burgername=burgername;
	}
	
	
		
	}
	
	
	
	

