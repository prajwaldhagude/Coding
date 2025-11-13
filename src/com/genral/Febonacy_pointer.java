package com.genral;

public class Febonacy_pointer 
{
   public int show(int num)
   {
	   int left = 0;
	   int right = 1;
	   int sum = 0;
	   
	   int next = 0;
	   while(left < num)
	   {
		   next = left + right;
		   left = right;
		   right = next;
	   }
	   return next;
   }
}
