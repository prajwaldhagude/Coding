package com.genral;
import java.util.ArrayList;
public class FindMissing 
{
    public ArrayList<Integer> Missing(int[] arr)
    {
    	ArrayList<Integer> al = new ArrayList<>();
    	int n = arr.length;
    	
    	for(int i=1;i<n;i++)
    	{
    		int prev = arr[i-1];
    		int curr = arr[i];
    		
    		if(curr - prev != 1)
    		{
    			for(int j= prev+1;j<curr;j++)
    			{
    				al.add(j);
    			}
    		}
    	}
    	return al;
    }
} 
