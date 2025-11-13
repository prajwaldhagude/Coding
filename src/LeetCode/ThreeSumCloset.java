package LeetCode;
import java.util.*;
public class ThreeSumCloset 
{
    public int closet(int[] arr,int target)
    {
    	Arrays.sort(arr);
    	int n = arr.length;
    	int prev = Integer.MAX_VALUE;
    	for(int i=0;i<n-2;i++)
    	{
    		int start = i+1;
    		int end = n-1;
    		
    		while(start < end)
    		{
    			int sum = arr[i] + arr[start] + arr[end];
    			if(sum == target && target < prev)
    			{
    			   prev = sum;
    			}
    			
    		}
    	}
    	return prev;
    }
}
