package string_tuto;

public class string_rotation 
{
   public boolean Rotation(String s1, String s2)
   {
	   String s = s1+s1;
	   char[] arr = s.toCharArray();
	   char[] ar = s2.toCharArray();
	   int j=1;
	   char r = arr[0];
	   Boolean br = true;
	   for(int i=0;i<arr.length-2;i++)
	   {
		   
		   if(arr[i]==ar[0])
		   {
			   int p = i+1;
			   while(j<ar.length)
			   {
				   if(arr[p] == ar[j])
				   {
					   p++;
					   j++;
					   
				   }
				   else
				   {
					   br = false;
					   break;
				   }
			   }
			  
		   }
	   }
	   return br;
	   
   }
}
