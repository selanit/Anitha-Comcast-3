package com.comcast.taxcal;

public class TaxCalc {
	
	public float calculate(String itm, int cost)
	{ 
	float pay;
	
		if((itm.equalsIgnoreCase("basic")))
		{
			
			pay= cost+((cost*1)/100);
			
			return pay;
		}
		if (itm.equalsIgnoreCase("luxury"))
		{
			
			pay=cost+((cost*9)/100);
			
			return pay;
		}
		else
	
			return cost;
		
		
	}
}
