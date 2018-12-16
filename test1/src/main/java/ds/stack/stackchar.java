package ds.stack;

public class stackchar {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public stackchar(int size)
	{
		this.maxSize=size;
		this.stackArray=new char[size];
		this.top=-1;
	}

	
  public void push(char j){
	  
	  if(isFull()){
		  System.out.println("Entering more elements than the mentioned size");
	  }
	  else{
		  top++;
		  stackArray[top]=j;
	  }
  }
  
  public char pop(){
	  if(isEmpty())
	  {
		  System.out.println("The stack is already empty");
		  return 'e';
	  }
	  else{
	  int old_top=top;
	  top--;
	  return stackArray[old_top];
	  }
  }
	  
 public char peak(){
	return stackArray[top];
}
 
 public boolean isEmpty()
 {
	 return(top==-1);
 }

 public boolean isFull(){
	return (maxSize-1==top);
 }
 
  



}
