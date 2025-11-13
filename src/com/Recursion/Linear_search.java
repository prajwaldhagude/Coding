package com.Recursion;

public class Linear_search 
{
    public int Linear(int[] arr,int value,int left,int right)
    {
    	int mid = left + (right-left)/2;
    	if(arr[mid]<value)
    	{
    		return Linear(arr,value,mid+1,right);
    	}
    	else if(arr[mid]>value)
    	{
    		return Linear(arr,value,left,mid-1);
    	}
    	else
    	{
    		return arr[mid];
    	}
    }
}
