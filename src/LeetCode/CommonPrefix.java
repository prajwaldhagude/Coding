package LeetCode;
import java.util.*;
public class CommonPrefix
{
	public void Rotate_90_degree(int[][] arr)
	
	{
         int n = arr.length;	
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i;j<arr[i].length;j++)
        	 {
        		 int temp = arr[i][j];
        		 arr[i][j] = arr[n-j-1][i];
        		 arr[n-j-1][i] = temp;
        	 }
         }
       
		
	}
}
