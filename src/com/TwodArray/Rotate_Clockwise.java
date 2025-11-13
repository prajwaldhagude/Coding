package com.TwodArray;

public class Rotate_Clockwise
{
    public void show(int[][] arr)
    {
    	int n= arr.length;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i;j<arr[i].length;j++)
    		{
    			int temp = arr[i][j];
    			arr[i][j] = arr[j][i];
    			arr[j][i] = temp;
    		}
    	}
    	
    	for(int i=0;i<n;i++)
    	{
    		int curr = 0;
    		int poss = n-1;
    		while(curr < poss)
    		{
    			int temp = arr[i][curr];
    			arr[i][curr] = arr[i][poss];
    			arr[i][poss] = temp;
    			curr++;
    			poss--;
    		}
    	}
    }
    
    public void AntiClock(int[][] arr)
    {
    	int n= arr.length;
    	
    	
    	for(int i=0;i<n;i++)
    	{
    		int curr = 0;
    		int poss = n-1;
    		while(curr < poss)
    		{
    			int temp = arr[i][curr];
    			arr[i][curr] = arr[i][poss];
    			arr[i][poss] = temp;
    			curr++;
    			poss--;
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i;j<arr[i].length;j++)
    		{
    			int temp = arr[i][j];
    			arr[i][j] = arr[j][i];
    			arr[j][i] = temp;
    		}
    	}
    }

}
