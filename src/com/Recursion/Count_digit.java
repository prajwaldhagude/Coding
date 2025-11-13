package com.Recursion;

public class Count_digit 
{
     public static int show(int n)
     {
    	 if(n == 0)
    	 {
    		 return 0;
    	 }
    	 return 2 + show(n /10);
     }
}
