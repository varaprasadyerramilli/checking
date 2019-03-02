package oopsmasterchallange;

public class basehamburger
{
private String breadRollType;
private String meat;
private int price;



//can add upto 4 additional items

private boolean lettuce;
private boolean tomato;
private boolean carrot;
private boolean cheese;


public basehamburger(String breadRollType,String meat) {
this.breadRollType=breadRollType;
this.meat=meat;
this.price=100;
}

public void addLettuce(boolean lettuceAdded)
{
if(lettuceAdded)
{
price+=15;
}
}

public void addTomato(boolean tomatoAdded)
{
if(tomatoAdded)
{
price+=25;
}
}

public void addCarrot(boolean carrotAdded)
{
if(carrotAdded)
{
price+=35;
}
}


public void addCheese(boolean cheeseAdded)
{
if(cheeseAdded)
{
price+=45;
}
}

public String getBreadRollType(){
return breadRollType;
}

public String getMeat(){
return meat;
}

public int getPrice(){
return price;
}



}



