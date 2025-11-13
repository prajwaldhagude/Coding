package com.Searching_lgorithm;

public class Linear_Search
{
      public int Search(int[] arr,int target)
      {
    	  int n= arr.length;
    	  for(int i=0;i<n;i++)
    	  {
    		  if(arr[i]==target)
    		  {
    			  return i;
    		  }
    	  }
    	  return -1;
      }
}
