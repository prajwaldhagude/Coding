package com.genral;

import java.util.Arrays;

public class Find_duplicate 
{
    public int[] Duplicate(int[] arr)
    {
    	Arrays.sort(arr);
    	int n = arr.length;
    	int k=0;
    	int[] ap = new int[n];
    	
    	for(int i=1;i<n;i++)
    	{
    		if((arr[i] == arr[i-1]) && (k==0 || arr[i] != ap[k-1]))
    		{
    			ap[k++] = arr[i];
    		}
    	}
    	return Arrays.copyOf(ap, k);
    }
}
