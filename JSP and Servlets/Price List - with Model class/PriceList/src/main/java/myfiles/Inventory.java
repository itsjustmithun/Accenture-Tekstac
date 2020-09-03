 package myfiles;
     
     public class Inventory 
     {
     	private int apple=140;
     	private int orange=70;
     	private int mango=110;
     	private int grapes=115;
     	private int pineapple=90;
    	
   	
    	public int getPrice(String fname)
    	{
    		int fprice=0;
    		
    		if (fname.equalsIgnoreCase("apple")) fprice=apple;
    		if (fname.equalsIgnoreCase("orange")) fprice=orange;
    		if (fname.equalsIgnoreCase("mango")) fprice=mango;
   		if (fname.equalsIgnoreCase("grapes")) fprice=grapes;
    		if (fname.equalsIgnoreCase("pineapple")) fprice=pineapple;
    		
    		return fprice;
    		
    	}
    
    }