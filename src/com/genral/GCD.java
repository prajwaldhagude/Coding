package com.genral;
import java.util.*;
public class GCD 
{
  public int show(int a, int b)
  {
	 
	  if(b == 0)
	  {
		  return a;
	  }
	 return show(b,a % b);
  }
}
