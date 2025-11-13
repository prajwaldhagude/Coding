package com.genral;

public class Sum_digit
{
  public int Sum(int n)
  {
	  if(n == 0)
	  {
		  return 0;
	  }
	  return (n % 10) + Sum(n/10); 
  }
}
