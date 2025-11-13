package com.genral;

import java.util.Arrays;

public class Remove_duplicate_array_without_sort
{
   public int[] Remove(int[] arr)
   {
	   int n= arr.length;
	   int[] unique = new int[n];
	   int k=0;
	   for(int i=0;i<n;i++)
	   {
		   Boolean found = false;
		   for(int j=0;j<k;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   found =true;
				   break;
			   }
		   }
		   if(!found)
		   {
			   unique[k] = arr[i];
			   k++;
		   }
	   }
	   return Arrays.copyOf(unique, k);
   }
}
