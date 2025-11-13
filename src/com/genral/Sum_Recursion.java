package com.genral;

public class Sum_Recursion
{
    public int Sum(int n)
    {
    	if(n>0)
    	{
    		return (n + Sum(n-1));
    	}
    	else
    	{
    		return n;
    	}
	    }
}
