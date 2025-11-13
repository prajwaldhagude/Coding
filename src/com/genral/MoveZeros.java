package com.genral;

public class MoveZeros 
{
    public void remove(int[] arr)
    {
    	int n = arr.length;
    	int j = 0;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i] != 0)
    		{
    		
    			arr[j] = arr[i];
    			j++;
    		}
        
    	}
    	
    	for(int l = j;l<n;l++)
    	{
    		arr[l] = 0;
    	}
    }
}
