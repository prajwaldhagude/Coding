package LeetCode;
import java.util.*;
public class longestPrefixString 
{
     public String prifix(String[] arr)
     {
    	 int n = arr.length;
    	  StringBuilder sb = new StringBuilder();
    	  Arrays.sort(arr);
    	  char[] first = arr[0].toCharArray();
     	 char[] last = arr[n-1].toCharArray();
    	  int np = first.length;
    	  for(int i=0;i<np;i++)
    	  {
    		  if(first[i] != last[i]) 
    		  {
    			  break;  
    		  }
    		  sb.append(first[i]);
    	  }
    	 return sb.toString();
     }
}
