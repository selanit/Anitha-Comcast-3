package com.comcast.taxtest;

import org.testng.annotations.*;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.comcast.taxcal.*;

import org.testng.annotations.Test;

public class TaxTest {
	
	TaxCalc txcal= new TaxCalc();
	float res;

  
  
  @Test
  public void basiccal()
  {
	  res=txcal.calculate("Basic", 100);
	  assertEquals(101,Math.round(res));
	  
  }
  
  @Test
  public void luxurycal()
  {
	  res=txcal.calculate("luxury",200);
	   assertEquals(218, Math.round(res));
	 
  }
  
@Test
public void anyother()
{
	res=txcal.calculate("Other", 20);
	assertEquals(20, Math.round(res));
}
}
