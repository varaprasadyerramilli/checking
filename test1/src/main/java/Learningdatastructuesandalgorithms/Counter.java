package Learningdatastructuesandalgorithms;

public class Counter {


public Counter(String str) {
		this.str = str;
	}

private String str;
private int counter=0;

public  void increment(){
	counter++;
}

public  int getCurrentValue(){
	return counter;
}

public String toString(){
	return str;
	
}

}
