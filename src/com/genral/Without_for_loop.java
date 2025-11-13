package com.genral;
import java.util.*;
public class Without_for_loop 
{
   public int count(int a)
   {
      int count = 0;
      while(a != 0)
      {
    	  a = a/10;
    	  count++;
      }
	return count;
   }
   
   public boolean Amstrong(int a)
   {
	   int n = a;
	   int count = count(n);
	   int sum = 0;
	   while(n != 0)
	   {
		   int r = n % 10;
		   sum = sum + (int)Math.pow(r , count);
		   n = n /10;
	   }
	   if(sum == a)
	   {
		   return true;
	   }
	   return false;
   }
}
