package com.TwodArray;

public class Diagonal_sum 
{
   public int show(int[][] arr)
   {
	   int n = arr.length;
	   int sum = 0;
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<arr[i].length;j++)
		   {
			   if(i==j)
			   {
				   sum = sum+arr[i][j];
			   }
		   }
	   }
	   return sum;
   }
}
