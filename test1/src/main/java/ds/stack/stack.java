package ds.stack;

public class stack {
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public stack(int size)
	{
		this.maxSize=size;
		this.stackArray=new long[size];
		this.top=-1;
	}

	
  public void push(long j){
	  
	  if(isFull()){
		  System.out.println("Entering more elements than the mentioned size");
	  }
	  else{
		  top++;
		  stackArray[top]=j;
	  }
  }
  
  public long pop(){// This is pointing last entered item as first one to display in the console
	  if(isEmpty())
	  {
		  System.out.println("The stack is already empty");
		  return -1;
	  }
	  else{
	  int old_top=top;
	  top--;
	  return stackArray[old_top];
	  }
  }
	  
 public long peak(){
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
