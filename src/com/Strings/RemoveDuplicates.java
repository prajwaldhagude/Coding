package com.Strings;
import java.util.*;
public class RemoveDuplicates 
{
   public String Remove(String s)
   {
	   
	   char[] st = s.toCharArray(); 
	   int n = st.length;
	   StringBuilder result = new StringBuilder();
	   result.append(st[0]);
	   for(int i=1;i<n;i++)
	   {
		   if(st[i] != st[i-1])
		   {
			   result.append(st[i]);
			   
		   }
	   }
	   
	   return result.toString();
   }
}
