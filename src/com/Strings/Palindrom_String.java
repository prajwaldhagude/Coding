package com.Strings;
import java.util.*;
public class Palindrom_String 
{
    public boolean check(String s)
    {
    	String sp = s.toLowerCase();
    	int n = sp.length();
    	String pt = "";
    	for(int i=n-1;i>=0;i--)
    	{
    		char ts = sp.charAt(i);
    		pt = pt+ ts;
    	}
    	if(pt.equals(sp))
    	{
    		return true;
    	}
    	return false;
    }
}
