package com.genral;

public class StarPrint 
{
    public void Square(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=n;j++)
    		{
    			if(i==1 || j==1 || i==n || j==n)
    			{
    			System.out.print("* ");
    			}
    			else
    			{
    				System.out.print("  ");
    			}
    		}
    		System.out.println();
    	}
    	
    	
    }
    
    public void Print(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=i;j<=n;j++)
    		{
				System.out.print(" ");

    		}
    		for(int j=1;j<=i;j++)
    		{
    			if(i==j || j==1)
    			{
    				System.out.print("*");
    			}
    			else
    			{
    				System.out.print("  ");
    			}
    		}
			System.out.println();

    	}
    }
    
    
}
