package oopsmasterchallange;

public class basehamburger {
	private String breadRollType;
	private String meat;
	private int baseprice;
	public String getBreadRollType() {
		return breadRollType;
	}


	public String getMeat() {
		return meat;
	}


	public int getBaseprice() {
		return baseprice;
	}

	private int finalPrice;
	
//To record 4additionals price and name	
	private int addition1price;
	private String addition1name;
	
	private int addition2price;
	private String addition2name;
	
	private int addition3price;
	private String addition3name;
	
	private int addition4price;
	private String addition4name;

	public basehamburger(String breadRollType, String meat, int price) {
		this.breadRollType = breadRollType;
		this.meat=meat;
		this.baseprice = price;
	}
	
	
//setters for all the additions tracking the name and price
	public void setAdditions1PriceAndName(String name, int price){
	this.addition1price=price;
	this.addition1name=name;
	}
	
	public void setAdditions2PriceAndName(String name, int price){
		this.addition2price=price;
		this.addition2name=name;
		}
	public void setAdditions3PriceAndName(String name, int price){
		this.addition3price=price;
		this.addition3name=name;
		}
	
	public void setAdditions4PriceAndName(String name, int price){
		this.addition4price=price;
		this.addition4name=name;
		}
	
	
	public int finalBill(){
		finalPrice=this.baseprice;
		System.out.println("You ordered a burger having bread roll type of "+breadRollType+" having "+meat+" meat "+"with base price as "+baseprice);
		if(this.addition1name!=null){
			finalPrice+=this.addition1price;
		System.out.println("You ordered a topin "+addition1name+" with extra price of "+addition1price);
		}
		else{
			System.out.println("Topin 1 is not entered"); }
		if(this.addition2name!=null)	{
			finalPrice+=this.addition2price;
			System.out.println("You ordered a topin "+addition2name+" with extra price of "+addition2price);
		}		
		else
			System.out.println("Topin 2 is not entered");
		if(this.addition3name!=null)	{
			finalPrice+=this.addition3price;
			System.out.println("You ordered a topin "+addition3name+" with extra price of "+addition3price);
		}
		else
			System.out.println("Topin 3 is not entered");
		
		if(this.addition4name!=null)	{		
			finalPrice+=this.addition4price;
		System.out.println("You ordered a topin "+addition4name+" with extra price of "+addition4price);
		}
		else {
	System.out.println("Topin 4 is not entered"); }
		return finalPrice;
	}
	
	public int getBasePrice(){
		return this.baseprice;
	}

	}
