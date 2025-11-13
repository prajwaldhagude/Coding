package LinkedList;

public class MedianOfArray
{
   public double sortArray(int[] nums1,int[] nums2)
   {
	   int n = nums1.length;
	   int n1= nums2.length;
	   int[] merge = new int[n+n1];
	   for(int i=0;i<n;i++)
	   {
		   merge[i]= nums1[i];
	   }
	   for(int i=0;i<n1;i++)
	   {
		   merge[n+i]= nums2[i];
	   }
	 
	   int p = merge.length;
	   if(p %2 ==0)
	   {
		   int l = p/2;
		   double k = (merge[l]+merge[l-1])/2.0;
		   return k;
	   }
	   else
	   {
		    int h = p/2;
		    double g = merge[h];
		    return g;
	   }
   }
}
