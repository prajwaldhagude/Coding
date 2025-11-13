package com.Recursion;

public class Print_element 
{
  public void Print(int[] arr,int index)
  {
	  if(index < 0) return ;
	  System.out.print(arr[index]+" ");
	  Print(arr,index-1);
	  
  }
}
