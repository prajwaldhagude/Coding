package com.genral;
import java.util.*;
public class Frequency 
{
	public void Show(int[] arr)
    {
        int n = arr.length;
        Map<Integer,Integer> ap = new HashMap();
        Map<Integer,Integer> as = new TreeMap();
        for(int i : arr)
        {
            ap.put(i,1);
        }
            as.putAll(ap);
       
      System.out.println(ap);
     System.out.println(as);
}
}
