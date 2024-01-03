package com.elec.billing;

public class ElectricalBill {
	 public static int getBill(int units)
	    {	    	
		 	if (units <= 50) {
		 		return units * 5;
		 	}
		 	
		 	else if (units <= 100) 
	        {
	            return units * 10;
	        }

	        else if (units <= 200) {

	            return (100 * 10)+ (units - 100) * 15;

	        }

	        else if (units <= 300) {

	            return (100 * 10)+ (100 * 15)+ (units - 200)* 20;

	        }

	        else if (units > 300) {

	            return (100 * 10)+ (100 * 15)+ (100 * 20)+ (units - 300)* 25;

	        }
	        else {
	        	System.out.println("50");
	        }
	        return 0;

	    }
public static void main(String args[])
{
    int units = 0;
    System.out.println(getBill(units));
}
}
