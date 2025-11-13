package com.genral;
import java.util.*;
public class MissingNumber 
{
  public List<Integer> Missing(int[] arr)
  {
	  int n = arr.length;
	   List<Integer> ap = new ArrayList();
	   for(int i=0;i<n-1;i++)
	   {
		   int left = arr[i];
		   int next = arr[i+1];
		   int diff = next - left;
		   if(diff != 1)
		   {
		   while((left+1) < next)
		   {
			   left++;
				   ap.add(left);
			   
		   }
		   }
	   }
	   return ap;
  }
}
