package com.comcast.taxcal;

import java.util.Scanner;

public class Tax {

	
	public static void main(String[] args) {
		
		TaxCalc tcal=new TaxCalc();
		
		// TODO Auto-generated method stub
		System.out.println(" Enter the item as \"basic\" item or as \"luxury\" item");
		Scanner itm= new Scanner(System.in);
		String item=itm.next();
		System.out.println("Enter the price of the item");
		Scanner prce = new Scanner(System.in);
		int price = prce.nextInt();
		
		
		float total=tcal.calculate(item, price);
		System.out.println("The price of the \""+ item + "\" item is "+ Math.round(total) +" cents");
		
		
		
		
		
		
		

	}

}
