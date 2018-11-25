package test.test1;

/** Below are the points briefly described on how this code is an example of polymorphism
-> we created a Movie class which extends into other classes with movie names

-> Movie class has the method to return the "Plot of the movie" and "name of the movie"

->Created five classes other than Movie class. four with movie names && plot and one without plot

 */



class Movie//The job of this class is to print the movie name
{
	
	private String name;
	
	public Movie(String name) {
		this.name = name;
	}
  
	public String plot()
	{
		return "No plot here";
	}
	
	public String getName() {
		return name;
	}
}

class Jaws extends Movie {//another class

	public Jaws() {
		super("Jaws");
	}
	
	public String plot()
	{
		return "shark eats lots of people";
	}
}


class IndependenceDay extends Movie {//another class
	public IndependenceDay()
	{
		super("IndependenceDay");
	}
	
	public String plot()
	{
		return "Aliens try to take over planet earth";
	}
}

class Mazerunner extends Movie {//another class
	public Mazerunner(){
		super("Mazerunner");
	}
	
	public String plot()
	{
		return "Kids try and escape a maze";
	}
}


class Starwars extends Movie {//another class
	public Starwars() {
		super("Starwars");
	}
	public String plot()
	{
		return "Imperial forces try to take over universe";
	}	
}

class Forgetablemovie extends Movie{//another class
	public Forgetablemovie(){
		super("Forgetablemovie");
	}
	
}
 


public class Main {	
	public static void main(String[] args)
	{
		for(int i=1; i<=11; i++){
			Movie movie = randomMovie();
			System.out.println("Movie #" +i+
					           ": "+movie.getName()+ "\n"+
					            "Plot: "+movie.plot()+ "\n");
		}
	}
 
	public static Movie randomMovie(){
		
		int randomNumber=(int) (Math.random()*5)+1;
		System.out.println("Random number generated was: "+randomNumber);
		switch(randomNumber)
		{
		case 1: 
			return new Jaws();
			
		case 2:
			return new IndependenceDay();
			
		case 3:
			return new Mazerunner();
			
		case 4:
			return new Starwars();
			
		case 5:
			return new Forgetablemovie();
			
	   default:
		   return null;
		}
	}
}
