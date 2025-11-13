package com.Recursion;

public class Power 
{
   public int Pow(int a, int b)
   {
	  
	   if(b==0)
	   {
		   return 1;
	   }
	   return a*Pow(a , b-1);
   }
}
