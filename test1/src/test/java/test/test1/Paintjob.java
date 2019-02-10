package test.test1;

public class Paintjob {
	
	
	    public static int getBucketCount(double width,double height,double areaPerBucket, int extraBuckets)
	    {
	    	int num=0;
	    	double area,bobcancover,remainingarea,bucketsneedmore;   		    	
	    	
	        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)
	        {
	            num=-1;
	        }
	        else
	        {
	            area=width*height;
	            if(extraBuckets>=0)
	            {
	            	bobcancover=extraBuckets*areaPerBucket;
	            	remainingarea=area-bobcancover;
	            	bucketsneedmore=Math.ceil(remainingarea/areaPerBucket);
	            	num=(int) bucketsneedmore;
	            }
	        }
	        
	        return num;
	    }
	    
	    public static int getBucketCount(double width, double height, double areaPerBucket)
	    {
	    	int num=0;
	    	double area,needbuckets;	    	
	    	
	        if(width<=0||height<=0||areaPerBucket<=0)
	        {
	            num=-1;
	        }
	        else
	        {
	            area=width*height;
	            needbuckets=Math.ceil(area/areaPerBucket);
	            num=(int) needbuckets;
	                      	
	            
	        }
	        
	        return num;
	    	
	    }
	    
	    public static int getBucketCount(double area,double areaPerBucket)
	    {
	    	int num=0;
	    	double bucketsneeded;
	    	if(area<=0||areaPerBucket<=0)
	    	{
	    		num=-1;
	    	}
	    	else
	    	{
	    		bucketsneeded=Math.ceil(area/areaPerBucket);
	    		num=(int) bucketsneeded;
	    	}
	    	
	    	return num;
	    }
	    
	    public static void main(String[] args)
	    {
	    	System.out.println(getBucketCount(3.26,0.75));
	    }
	

}
