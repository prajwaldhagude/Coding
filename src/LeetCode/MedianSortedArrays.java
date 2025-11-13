package LeetCode;
import java.util.Arrays;
public class MedianSortedArrays 
{
      public double findMedianSortedArrays(int[] nums1, int[] nums2)
      {
    	 int n = nums1.length;
    	 int n1 = nums2.length;
    	 int[] arr= new int[n+n1];
    	 
    	 for(int i=0;i<n;i++)
    	 {
    		 arr[i]= nums1[i];
    	 }
    	 
    	 for(int i=0;i<n1;i++)
    	 {
    		 arr[n+i]= nums2[i];
    	 }
    	  Arrays.sort(arr);
    	  
    	  double d;
    	  int np= arr.length;
    	 
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  if(np %2 ==0)
        	  {
    			  int p = np/2;
        		 d = (arr[p]+arr[p-1])/2.0;
        		 return d;
        	  }
    		  
    	  }
    	 
    	 return arr[np/2];
      }
}
