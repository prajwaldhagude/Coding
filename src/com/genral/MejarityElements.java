package com.genral;
import java.util.*;
import com.classes.Bubble;
import com.classes.selection_sort;
public class MejarityElements 
{
   public void Mejarity(int[] arr)
   {
	   int count = 0;
	   int ap = 0;
	   int mejar = 0;
	   int n = arr.length;
	   for(int i=0;i<n;i++)
	   {
		   for(int j= 0;j<n;j++)
		   {
			   if(arr[i]==arr[j])
			   {
				  ap++;
			   }
		   }
		   if(count <= ap)
		   {
			   count=ap;
			   mejar = arr[i];
		   }
		    ap = 0;
		    System.out.println("Element: "+mejar+" "+"Count: "+count); 
	   }
	   
	  
   }
}
