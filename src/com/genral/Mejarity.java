package com.genral;

public class Mejarity
{
  public int mejority(int[] arr)
  {
	  int k = 0;
	  int n = arr.length;
	 
	  for(int i=0;i<n-1;i++)
	  {
		  
		  for(int j=i+1;j<n;j++)
		  {
		  if(arr[i]==arr[j])
		  {
			  k++;
		  }
		  }
		  k=0;
	  }
	  return k;
  }
}
