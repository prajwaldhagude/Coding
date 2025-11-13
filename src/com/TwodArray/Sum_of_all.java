package com.TwodArray;

public class Sum_of_all 
{
    public int show(int[][] arr)
    {
    	int n= arr.length;
    	int sum = 0;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i;j<arr[i].length;j++)
    		{
    			sum = sum+arr[i][j];
    		}
    	}
    	return sum;
    }
}
