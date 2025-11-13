package com.genral;
public class Frequency_of_each_char
{
   public void frequency(String s)
   {
	   int[] arr = new int[256];
	 for(int i=0;i<s.length();i++)
	 {
		 char c = s.charAt(i);
		 arr[c]++;
	 }
	 for(int i=0;i<256;i++)
	 {
		 System.out.print((char)i+"->"+arr[i]);
	 }
	  
	   
   }
}
