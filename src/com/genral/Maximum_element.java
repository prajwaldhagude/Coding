package com.genral;

public class Maximum_element
{
      public int Max(int[] arr)
      {
    	  int n = arr.length;
    	  int max =arr[0];
    	  for(int i=1;i<n;i++)
    	  {
    		 
    		  if(max > arr[i])
    		  {
    			  max = arr[i];
    		  }
    	  }
    	  return max;
      }
      
      public void Second_last(int[] arr)
    	{
    	  int largest = Integer.MIN_VALUE;
          int secondLargest = Integer.MIN_VALUE;
          System.out.println(largest);
          System.out.print(secondLargest);
        }
      
      public boolean CheckSorted(int[] arr)
      {
    	  
    	  int n = arr.length;
    	  for(int i=0;i<n-1;i++)
    	  {
    	  if(arr[i] > arr[i+1])
    	  {
    		  return false;
    	  }
    	  }
    	  return true;
      }
}
