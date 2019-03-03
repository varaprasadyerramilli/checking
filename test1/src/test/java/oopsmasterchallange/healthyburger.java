package oopsmasterchallange;

public class healthyburger extends basehamburger {
	
	public healthyburger(String breadRollType, String meat, int price) {
		super(breadRollType, meat, price);
		// TODO Auto-generated constructor stub
	}
	//two additional topins added
	private int addition5Price;
	private String addition5name;
	
	private int addition6Price;
	private String addition6name;
	
	
	
	//setting the two values for two additional topins added in this class
	public void setAddtion5PriceandName(String name,int price){
	this.addition5name=name;
	this.addition5Price=price;
		}
	
	public void setAddtion6PriceandName(String name,int price){
		this.addition6name=name;
	    this.addition6Price=price;
	}

	@Override
	public int finalBill() {
		// TODO Auto-generated method stub
		System.out.println("You ordered a burger having bread roll type of "+getBreadRollType()+" having "+getMeat()+" meat "+"with base price as "+getBasePrice());
		int FinalPrice=super.finalBill();//called the finalbill method like this so that it executes the steps in the base hamburger class and then executes the finalbill method in this class 
		//so in this way we can achieve proper results		
		if(this.addition5name!=null){
			FinalPrice+=this.addition5Price;
			System.out.println("You ordered a topin "+this.addition5name+" with extra price of "+this.addition5Price);			
		}
		else {
			System.out.println("Topin 5 not entered");
		}
		if(this.addition6name!=null){
			FinalPrice+=this.addition6Price;
			System.out.println("You ordered a topin "+this.addition6name+" with extra price of "+this.addition6Price);	
		}
		else{
			System.out.println("Topin 6 not entered");
		}
		return FinalPrice;
	}
	
	public int getBasePrice(){
		return this.getBaseprice();
	}
	
	
	
	

}
