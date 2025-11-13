package com.Searching_lgorithm;

public class Binary_search 
{
  public int Binary(int[] arr,int val)
  {
	  int left = 0;
	  int right = arr.length-1;
	  while(left<=right)
	  {
		  int mid = left + (right-left)/2;
		  if(arr[mid]==val)
		  {
			  return mid;
		  }
		  else if(arr[mid] < val)
		  {
			  left = mid+1;
		  }
		  else
		  {
			  right = mid-1;
		  }
	  }
	  return -1;
  }
}
