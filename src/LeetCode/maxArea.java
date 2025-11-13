package LeetCode;

public class maxArea 
{
    public int Area(int[] arr)
    {
         int area = 0;
         int n = arr.length;
         ;
         int cou=0;
         for(int i=0;i<n-1;i++)
         {
        	 for(int j=i+1;j<n;j++)
        	 {
        		 
        		int width = j-i;
        		 int a = Math.min(arr[i], arr[j]);
        		 int ap = a*width;
        		 if(ap > area)
        		 {
        			 area = ap;
        		 }
        	 }
         }
         return area;
    }
    public int Optimal(int[] arr)
    {
    	int area=0;
    	int n = arr.length;
    	int left = 0;
    	int right = n-1;
    	while(left < right)
    	{
    		int width = right-left;
    		int ap = Math.min(arr[left], arr[right]);
    		int ar = ap*width;
    		if(ar > area)
    		{
    			area = ar;
    		}
    		if(arr[left] < arr[right])
    		{
    			left++;
    		}
    		else
    		{
    			right--;
    		}
    	}
    	
    	return area;
    }
}
