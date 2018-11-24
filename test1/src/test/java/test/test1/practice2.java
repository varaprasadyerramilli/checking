package test.test1;

public class practice2 {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	public void setModel(String model)//The benefit of setModel method is we can put a check
	//on the input value
	{
		String validModel=model.toLowerCase();
		if(validModel.equals("maruthi")||validModel.equals("honda"))
		{
			this.model=model;
		}
		else
		{
			this.model="unknown";
		}
	
		
	}
   public String getModel()
   {
	   return this.model;
   }
}
