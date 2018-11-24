package test.test1;

public class test {
	public static int sumDigits(int num)
	{
	    
	    int totalvalue=0;
	    
	    if(num<10)
	    {
	    return -1;
	    }	    
	        while(num>0)
	        {
	        //extract the least significant digit
	        	int digit=num%10;
	        	totalvalue+=digit;
	        //drop the least significant digit
	        	num /=10;
	        }
	        return totalvalue;
	    
	    
	}
	
	public static void isPalindrome()
	{
	    int reverse =0;
	    int number=121;
	    int unreversednumber=number;
	    while(number>0)
	    {
	    int lastDigit=number%10;
	    reverse=(reverse*10)+lastDigit;
	    number/=10;
	    }
	    System.out.println("reversed number "+reverse);
	    System.out.println("unreversed number "+unreversednumber);
	    
	}
	 public static int getGreatCommonDivisor(int first, int second)
	    {
	        
	        int min=0,max=0;
	        int gcd=0;
	        if(first<10||second<10)
	        {
	        return -1;
	        }
	        else
	        {
	            if(first>second)
	            {
	                max=first;
	                min=second;
	            }
	            else
	            {
	                max=second;
	                min=first;
	            }
	           for(int i=1; i<=min; i++)
	           {
	               if(min%i==0 && max%i==0)
	               {
	                   gcd=i;
	               }
	           }
	            return gcd;
	        }
	    }
	 
	 public static void numberToWords(int number)
	    {
		 int lastdigit1=0;
		int reversenumber=reverse(number);
		
	        if(reversenumber<=0)
	        {
	            System.out.println("Invalid Value");
	        }
	        else  if(reversenumber>0)
	        {
	            while(reversenumber>0)
	            {   
	                lastdigit1=reversenumber%10;
	                switch(lastdigit1)
	                {
	                    case 0:
	                    System.out.println("Zero");
	                    break;
	                    case 1:
	                    System.out.println("One");
	                    break;
	                    case 2:
	                    System.out.println("Two");
	                    break;
	                    case 3:
	                    System.out.println("Three");
	                    break;
	                    case 4:
		                System.out.println("Four");
		                break;
	                    case 5:
		                System.out.println("Five");
		                break;
	                    case 6:
			            System.out.println("Six");
			            break;
	                    case 7:
			            System.out.println("Seven");
			            break;
	                    case 8:
			            System.out.println("Eight");
			            break;
	                    case 9:
			            System.out.println("Nine");
			            break;
	                }
	                reversenumber/=10;	                
	            }
	        }
	    }
	 
	 
	 public static int reverse(int number)
	 {
		 int lastdigit=0;
		 int reverse=0;
		 while(number!=0)
		 {
			 lastdigit=number%10;
			 reverse=(reverse*10)+lastdigit;
			 number/=10;
		 }
		 return reverse;
	 }
 public static int getDigitCount(int number)
 {
	 int count=0;
	 if(number<0)
	 {
		 return -1;
	 }
	 else
	 {
		 while(number>=0)
		 {
			 number/=10;
			 count++;
		 }
		 return count;
	 }
 }
 
 public static void printSquareStar(int number)
 {
     if(number<5)
     {
         System.out.println("Invalid Value");
     }
     else
     {
         for(int i=1; i<=number; i++)//row
         {
             for(int j=1; j<=number;j++)//columns
             {
                 if(i==1||i==number)//first or last row condition
                 {
                 System.out.print("*");
                 }
                 else if(i==j)//when the row number equals the column number condition
                 {
                  System.out.print("*");   
                 }
                 else if(i!=1||i!=number)
                 {
                     if(j==1 || j==number)//first or last column condtion
                     {
                         System.out.print("*");
                     }
                     else if(j==number-i+1)//row count - current row +1 condition
                     {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                 }
                 
             }
             
             System.out.println();
         }
     }
 }
	public static void main(String []args){
        
        numberToWords(200);
        System.out.println(getDigitCount(0));
     
     }
	}
